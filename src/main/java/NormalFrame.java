public class NormalFrame implements Frame {

    private char firstRoll = '-';
    private char secondRoll = '-';

    public NormalFrame(char firstRoll, char secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    @Override
    public int getFrameScore() {
        return getRollScore(this.secondRoll) + getRollScore(this.firstRoll);
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
        NormalFrame frame = (NormalFrame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
