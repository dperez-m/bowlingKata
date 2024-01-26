public class Frame {

    private char firstRoll;
    private char secondRoll;
    private int frameScore;

    public Frame(char firstRoll, char secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.frameScore = 0;
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }
    public int getFrameScore(){
        return Character.getNumericValue(firstRoll) + Character.getNumericValue(secondRoll);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
