public class StrikeFrame implements Frame {

    private char firstRoll = '-';
    private char secondRoll = '-';
    private char extraRoll = '-';
    private char secondExtraRoll = '-';

    public StrikeFrame(char firstRoll, char secondRoll, char extraRoll, char secondExtraRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.extraRoll = extraRoll;
        this.secondExtraRoll = secondExtraRoll;
    }

    @Override
    public int getFrameScore() {
        int base_score = (this.secondRoll == '/') ? getRollScore(this.secondRoll)
                : getRollScore(this.secondRoll) + getRollScore(this.firstRoll);
        int extra_score = (this.secondExtraRoll == '/') ? getRollScore(this.secondExtraRoll)
                : getRollScore(this.extraRoll) + getRollScore(this.secondExtraRoll);
        return base_score + extra_score;
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
        StrikeFrame frame = (StrikeFrame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
