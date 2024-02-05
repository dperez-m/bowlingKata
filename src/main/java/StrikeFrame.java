
public class StrikeFrame implements Frame {

    private char strikeRoll = 'X';
    private char firstExtraRoll = '-';
    private char secondExtraRoll = '-';

    public StrikeFrame(char firstRoll, char secondRoll, char firstExtraRoll, char secondExtraRoll) {
        this.strikeRoll = firstRoll;
        this.firstExtraRoll = firstExtraRoll;
        this.secondExtraRoll = secondExtraRoll;
    }

    @Override
    public int getFrameScore() {
        int extraScore = (this.secondExtraRoll == '/') ? getRollScore(this.secondExtraRoll)
                : getRollScore(this.firstExtraRoll) + getRollScore(this.secondExtraRoll);
        return getRollScore(this.strikeRoll) + extraScore;
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
        return strikeRoll == frame.strikeRoll && firstExtraRoll == frame.firstExtraRoll
                && secondExtraRoll == frame.secondExtraRoll;
    }

}
