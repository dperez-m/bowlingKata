import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiccionarioTest {
    @Test
    void testExistingValues() {
        assertEquals(10, Diccionario.charValue('/'));
        assertEquals(0, Diccionario.charValue('-'));
        assertEquals(10, Diccionario.charValue('X'));
        assertEquals(8, Diccionario.charValue('8'));
    }

    @Test
    void testNonExistingValues() {
        assertEquals(0, Diccionario.charValue('A'));
        assertEquals(0, Diccionario.charValue('g'));
    }
}
