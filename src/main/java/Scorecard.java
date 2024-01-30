import java.util.Arrays;

public class Scorecard {
    private final String rolls;
    private final Frame[] frames = new Frame[10];

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

    private void createFrames(){
        int card_index = 0;
        for (int frame_index = 0; frame_index < 10; frame_index++){
            if (rolls.charAt(card_index + 1) == '/'){
                frames[frame_index] = new SpareFrame(rolls.charAt(card_index),rolls.charAt(card_index + 1), rolls.charAt(card_index + 2));
            } else if (rolls.charAt(card_index) == 'X') {
                frames[frame_index] = new StrikeFrame(rolls.charAt(card_index), '-', rolls.charAt(card_index + 1), rolls.charAt(card_index + 2));
                card_index--;
            } else {
                frames[frame_index] = new NormalFrame(rolls.charAt(card_index), rolls.charAt(card_index + 1));
            }
            card_index += 2;
        }
    }

    public int getTotalScore(){
        return Arrays.stream(frames).mapToInt(Frame::getFrameScore).sum();
    }
}
