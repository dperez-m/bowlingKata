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
        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            if (rolls.charAt(cardIndex + 1) == '/') {
                frames[frameIndex] = new SpareFrame(rolls.charAt(cardIndex), rolls.charAt(cardIndex + 1),
                        rolls.charAt(cardIndex + 2));
            } else if (rolls.charAt(cardIndex) == 'X') {
                frames[frameIndex] = new StrikeFrame(rolls.charAt(cardIndex), '-', rolls.charAt(cardIndex + 1),
                        rolls.charAt(cardIndex + 2));
                cardIndex--;
            } else {
                frames[frameIndex] = new NormalFrame(rolls.charAt(cardIndex), rolls.charAt(cardIndex + 1));
            }
            cardIndex += 2;
        }
    }

    public int getTotalScore() {
        return Arrays.stream(frames).mapToInt(Frame::getFrameScore).sum();
    }
}
