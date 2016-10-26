import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;

public class TicTacToeTest
{
    @Test
    public void testSomeLibraryMethod()
    {
        assertEquals(1, TicTacToe.testTester());
    }
    @Test
    public void testGameResult()
    {
      assertEquals("Draw!", Interface.gameResult('D'));
    }
}
