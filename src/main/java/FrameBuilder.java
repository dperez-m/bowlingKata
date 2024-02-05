
public class FrameBuilder {

    final static char STRIKE = 'X';
    final static char SPARE = '/';

    public static Frame newFrame(char firstRoll, char secondRoll, char thirdRoll) {
        if (firstRoll == STRIKE)
            return new StrikeFrame(firstRoll, secondRoll, thirdRoll, secondRoll);
        if (secondRoll == SPARE)
            return new SpareFrame(firstRoll, secondRoll, thirdRoll);
        return new NormalFrame(firstRoll, secondRoll);
    }
}
