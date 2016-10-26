import org.junit.Test;
import static org.junit.Assert.*;

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
      assertEquals("Winner is: X!", Interface.gameResult('X'));
    }
}
