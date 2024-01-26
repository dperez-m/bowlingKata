import java.util.Arrays;

public class Scorecard {
    private String rolls;
    private Frame[] frames = new Frame[10];


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
        int j = 0;
        for (int i = 0; i < 10; i++){
            frames[i] = new Frame(rolls.charAt(j),rolls.charAt(j + 1));
            j += 2;
        }

    }
}
