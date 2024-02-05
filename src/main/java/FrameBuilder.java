
public class FrameBuilder {

    public static Frame newFrame(char firstRoll, char secondRoll, char thirdRoll) {
        if (firstRoll == Frame.STRIKE && thirdRoll == Frame.SPARE)
            return new Frame(firstRoll, Frame.ZERO, thirdRoll);
        if (firstRoll == Frame.STRIKE)
            return new Frame(firstRoll, secondRoll, thirdRoll);
        if (secondRoll == Frame.SPARE)
            return new Frame(Frame.ZERO, secondRoll, thirdRoll);
        return new Frame(firstRoll, secondRoll, Frame.ZERO);
    }
}
