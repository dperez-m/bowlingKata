import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCardTest {

    Scorecard scorecard = null;
    @Disabled
    @BeforeEach
    public void initTest(){
        scorecard = new Scorecard("12345123451234512345");
    }


    @Test
    public void createScoreCardTest(){
        scorecard = new Scorecard("12345123451234512345");
        assertEquals("12345123451234512345", scorecard.getRolls());
    }

    @Test
    public void createFramesTest(){
        scorecard = new Scorecard("12345123451234512345");

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

    @Test
    public void getSimpleTotalScoreTest(){
        scorecard = new Scorecard("12345123451234512345");
        assertEquals(60, scorecard.getTotalScore());
    }
}
