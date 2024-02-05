import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameTest {

    @Test
    public void normalFrameTest() {
        NormalFrame frame = new NormalFrame('5', '5');
        Assertions.assertEquals(10, frame.getFrameScore());
    }

    @Test
    public void spareFrameTest() {
        SpareFrame frame = new SpareFrame('5', '/', '5');
        Assertions.assertEquals(15, frame.getFrameScore());
    }

    @Test
    public void strikeFrameTest() {
        StrikeFrame frame = new StrikeFrame('X', '-', 'X', '5');
        Assertions.assertEquals(25, frame.getFrameScore());
    }
}
