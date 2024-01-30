public class SpareFrame implements Frame {

    private char firstRoll;
    private char secondRoll;
    private char extraRoll;

    public SpareFrame(char firstRoll, char secondRoll, char extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
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

    @Override
    public int getFrameScore(){
        return getRollScore(this.secondRoll) + getRollScore(this.extraRoll);
    }

    private int getRollScore(char roll){
        return Diccionario.charValue(roll);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpareFrame frame = (SpareFrame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
