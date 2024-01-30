public class StrikeFrame implements Frame {

    private char firstRoll;
    private char secondRoll;
    private char extraRoll;
    private char secondExtraRoll;

    public StrikeFrame(char firstRoll, char secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = '-';
        this.secondExtraRoll = '-';
    }

    public StrikeFrame(char firstRoll, char secondRoll, char extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
        this.secondExtraRoll = '-';
    }

    public StrikeFrame(char firstRoll, char secondRoll, char extraRoll, char secondExtraRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
        this.secondExtraRoll = secondExtraRoll;
    }

    public char getFirstRoll() {
        return firstRoll;
    }

    public void setFirstRoll(char firstRoll) {
        this.firstRoll = firstRoll;
    }

    public char getSecondRoll() {
        return secondRoll;
    }

    public void setSecondRoll(char secondRoll) {
        this.secondRoll = secondRoll;
    }

    public char getExtraRoll() {
        return extraRoll;
    }

    public void setExtraRoll(char extraRoll) {
        this.extraRoll = extraRoll;
    }

    public char getSecondExtraRoll() {
        return secondExtraRoll;
    }

    public void setSecondExtraRoll(char secondExtraRoll) {
        this.secondExtraRoll = secondExtraRoll;
    }

    @Override
    public int getFrameScore(){
        int base_score = (this.secondRoll=='/')? getRollScore(this.secondRoll) : getRollScore(this.secondRoll) + getRollScore(this.firstRoll);
        int extra_score = (this.secondExtraRoll=='/')? getRollScore(this.secondExtraRoll) : getRollScore(this.extraRoll) + getRollScore(this.secondExtraRoll);
        return base_score + extra_score;
    }

    private int getRollScore(char roll){
        return Diccionario.charValue(roll);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrikeFrame frame = (StrikeFrame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
