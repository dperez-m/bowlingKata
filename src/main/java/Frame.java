
public class Frame {

    final static char STRIKE = 'X';
    final static char SPARE = '/';
    final static char ZERO = '-';

    private char firstRoll = '-';
    private char secondRoll = '-';
    private char extraRoll = '-';

    public Frame(char firstRoll, char secondRoll, char extraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
    }

    public int getFrameScore() {
        return getRollScore(this.firstRoll) + getRollScore(this.secondRoll) + getRollScore(this.extraRoll);
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
        Frame frame = (Frame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll && extraRoll == frame.extraRoll;
    }

}