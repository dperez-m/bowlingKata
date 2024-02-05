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

        for (int frameIndex = 0; frameIndex < frames.length; frameIndex++) {
            char[] nextRolls = this.getNextRolls(cardIndex);
            frames[frameIndex] = FrameBuilder.newFrame(nextRolls[0], nextRolls[1], nextRolls[2]);
            cardIndex += nextRolls[0] == Frame.STRIKE ? 1 : 2; // Si es un strike solo avanzamos el indice 1
                                                               // posicion
        }
    }

    private char[] getNextRolls(int index) {
        char[] nextRolls = { Frame.ZERO, Frame.ZERO, Frame.ZERO };
        try {
            nextRolls[0] = this.rolls.charAt(index);
            nextRolls[1] = this.rolls.charAt(index + 1);
            nextRolls[2] = this.rolls.charAt(index + 2);
        } catch (ArrayIndexOutOfBoundsException e) {
            return nextRolls;
        }
        return nextRolls;
    }

    public int getTotalScore() {
        return Arrays.stream(frames).mapToInt(Frame::getFrameScore).sum();
    }
}
