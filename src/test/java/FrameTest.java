import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameTest {

    @Test
    public void normalFrameTest() {
        Frame frame = new Frame('5', '5', '-');
        Assertions.assertEquals(10, frame.getFrameScore());
    }

    @Test
    public void spareFrameTest() {
        Frame frame = new Frame('5', '/', '5');
        Assertions.assertEquals(15, frame.getFrameScore());
    }

    @Test
    public void strikeFrameTest() {
        Frame frame = new Frame('X', 'X', '5');
        Assertions.assertEquals(25, frame.getFrameScore());
    }
}
