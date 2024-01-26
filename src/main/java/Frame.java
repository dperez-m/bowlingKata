public class Frame {

    private char firstRoll;
    private char secondRoll;
    private int frameScore;
    private char extraRoll;

    public Frame(char firstRoll, char secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.frameScore = 0;
        extraRoll = 0;
    }

    public Frame(char firstRoll, char secondRoll, char extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
    }

    public int getFirstRoll() {
        return getFirstRollScore();
    }

    public int getSecondRoll() {
        return getSecondRollScore();
    }
    public int getFrameScore(){
        return getFirstRollScore() + getSecondRollScore();
    }
    private int getFirstRollScore(){
        return firstRoll == '-' ? 0 : Character.getNumericValue(firstRoll);
    }
    private int getSecondRollScore(){
        switch (secondRoll){
            case '/':
                return getSpareScore();
                break;
            default:

        }
    }
    private int getSpareScore(){
        return (10 - getFirstRoll()) + extraRoll;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
