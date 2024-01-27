import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCardTest {

    Scorecard scorecard = null;

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
    public void getSimpleGameTotalScoreTest(){
        scorecard = new Scorecard("12345123451234512345");
        assertEquals(60, scorecard.getTotalScore());
    }

    @Test
    public void getHeartbreakGameTotalScoreTest(){
        scorecard = new Scorecard("9-9-9-9-9-9-9-9-9-9-");
        assertEquals(90, scorecard.getTotalScore());
    }

    @Test
    public void getSpareGameTotalScoreTest(){
        scorecard = new Scorecard("5/5/5/5/5/5/5/5/5/5/5");
        assertEquals(150, scorecard.getTotalScore());
        scorecard = new Scorecard("9-3/613/815/-/8-7/8/8");
        assertEquals(131, scorecard.getTotalScore());
    }

    @Test
    public void getAllStrikeTotalScoreTest(){
        scorecard = new Scorecard("XXXXXXXXXXXX");
        assertEquals(300, scorecard.getTotalScore());
    }
}
