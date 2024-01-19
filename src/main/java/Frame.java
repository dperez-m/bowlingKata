import java.util.Objects;

public class Frame {

    private int firstRoll;
    private int secondRoll;
    private int totalScore;

    public Frame(int firstRoll, int secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.totalScore =0;
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return firstRoll == frame.firstRoll && secondRoll == frame.secondRoll;
    }

}
