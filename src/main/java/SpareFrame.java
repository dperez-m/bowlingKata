public class SpareFrame implements Frame {

    private char firstRoll = '-';
    private char secondRoll = '-';
    private char extraRoll = '-';

    public SpareFrame(char firstRoll, char secondRoll, char extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
    }

    @Override
    public int getFrameScore() {
        return getRollScore(this.secondRoll) + getRollScore(this.extraRoll);
    }

    private int getRollScore(char roll) {
        return Diccionario.charValue(roll);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SpareFrame frame = (SpareFrame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
