public class Frame {

    private char firstRoll;
    private char secondRoll;
    private char extraRoll;
    private char secondExtraRoll;

    public Frame(char firstRoll, char secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = '-';
        this.secondExtraRoll = '-';
    }

    public Frame(char firstRoll, char secondRoll, char extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
        this.secondExtraRoll = '-';
    }

    public Frame(char firstRoll, char secondRoll, char extraRoll, char secondExtraRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
        this.secondExtraRoll = secondExtraRoll;
    }

    public int getFirstRoll() {
        return getRollScore(this.firstRoll);
    }

    public int getSecondRoll() {
        return getRollScore(this.secondRoll);
    }
    public int getFrameScore(){
        int base_score = (this.secondRoll=='/')? getRollScore(this.secondRoll) : getRollScore(this.secondRoll) + getRollScore(this.firstRoll);
        int extra_score = (this.secondExtraRoll=='/')? getRollScore(this.secondExtraRoll) : getRollScore(this.extraRoll) + getRollScore(this.secondExtraRoll);
        return base_score + extra_score;
    }

    private int getRollScore(char roll){
        return Diccionario.charValue(roll);
    }
    
/*     private int getFirstRollScore(){
        return switch (firstRoll) {
            case 'X' -> getStrikeScore();
            case '-' -> 0;
            default -> Character.getNumericValue(firstRoll);
        };
    }
    private int getSecondRollScore(){
        return switch (secondRoll) {
            case '/' -> getSpareScore();
            case '-' -> 0;
            default -> Character.getNumericValue(secondRoll);
        };
    } */
    private int getSpareScore(){
        int total = 10 - getFirstRoll();
        switch (extraRoll){
            case 'X':
                return total += 10;
            case '-':
                return total;
            default:
                return total += Character.getNumericValue(extraRoll);
        }
    }
    private int getStrikeScore(){
        int total = 10;
        if (extraRoll == 'X'){
            total += 10;
        } else if(extraRoll != '-')
            total += Character.getNumericValue(extraRoll);
        if (secondExtraRoll == 'X')
            total += 10;
        else if (secondExtraRoll == '/' && extraRoll != 'X') {
            total += (10 - Character.getNumericValue(extraRoll));
        } else if (secondExtraRoll != '-')
            total += Character.getNumericValue(secondExtraRoll);

        return total;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
