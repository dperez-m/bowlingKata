import java.util.Arrays;

public class Scorecard {
    private final String rolls;
    private final Frame[] frames = new Frame[10]; // se declara como final porque no va a cambiar

    public Scorecard(String rolls) {
        this.rolls = rolls;
        createFrames();
    }

    public String getRolls() {
        return rolls;
    }

    public Frame[] getFrames() {
        return frames;
    }

    private void createFrames() {
        int cardIndex = 0;
        char firstRoll;
        char secondRoll;
        char thirdRoll;

        for (int frameIndex = 0; frameIndex < frames.length; frameIndex++) {
            firstRoll = rolls.charAt(cardIndex);
            secondRoll = rolls.charAt(cardIndex + 1);
            thirdRoll = rolls.length() == cardIndex + 2 ? '-' : rolls.charAt(cardIndex + 2);
            Frame newFrame = FrameBuilder.newFrame(firstRoll, secondRoll, thirdRoll);
            frames[frameIndex] = newFrame;
            cardIndex += newFrame instanceof StrikeFrame ? 1 : 2; // Si es un strike solo avanzamos el indice 1 posicion
        }
    }

    public int getTotalScore() {
        return Arrays.stream(frames).mapToInt(Frame::getFrameScore).sum();
    }
}
