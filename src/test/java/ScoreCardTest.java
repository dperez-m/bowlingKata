import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreCardTest {

    Scorecard scorecard = null;

    @BeforeEach
    public void initTest(){
        scorecard = new Scorecard("12345123451234512345");
    }


    @Test
    public void createScoreCardTest(){
        Assertions.assertEquals("12345123451234512345", scorecard.getRolls());
    }

    @Test
    public void createFramesTest(){
        Frame[] frames = new Frame[10];
        frames[0] = new Frame ('1', '2');
        frames[1] = new Frame ('3', '4');
        frames[2] = new Frame ('5', '1');
        frames[3] = new Frame ('2', '3');
        frames[4] = new Frame ('4', '5');
        frames[5] = new Frame ('1', '2');
        frames[6] = new Frame ('3', '4');
        frames[7] = new Frame ('5', '1');
        frames[8] = new Frame ('2', '3');
        frames[9] = new Frame ('4', '5');

        Assertions.assertArrayEquals(frames, scorecard.getFrames());
    }
}
