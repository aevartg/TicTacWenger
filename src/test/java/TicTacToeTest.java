import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest
{
    @Test
    public void testSomeLibraryMethod()
    {
        assertEquals(0, TicTacToe.testTester());
    }

    @Test
    public void testCheckStatus()
    {
        char gameBoard[][] = {{'X','X','3'},{'4','O','6'},{'X','O','O'}};
        char gameBoard2[][] = {{'X','X','X'},{'4','O','6'},{'7','8','O'}};
        char gameBoard3[][] = {{'X','O','3'},{'4','O','X'},{'X','O','O'}};
        char gameBoard4[][] = {{'X','X','O'},{'X','O','O'},{'X','O','X'}};
        char gameBoard5[][] = {{'O','O','X'},{'X','X','O'},{'O','X','X'}};
        char gameBoard6[][] = {{'X','X','3'},{'4','X','6'},{'O','O','O'}};

        char r1,r2,r3,r4,r5,r6;
	r1 = Domain.checkStatus(gameBoard);
	r2 = Domain.checkStatus(gameBoard2);
	r3 = Domain.checkStatus(gameBoard3);
	r4 = Domain.checkStatus(gameBoard4);
	r5 = Domain.checkStatus(gameBoard5);
	r6 = Domain.checkStatus(gameBoard6);

        assertEquals('N',r1);
        assertEquals('X',r2);
        assertEquals('O',r3);
        assertEquals('X',r4);
        assertEquals('N',r5);
        assertEquals('O',r6);

	}

	@Test
	public void testInitialGameboard(){
		char [] []compareisonBoard = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		assertEquals (compareisonBoard,Domain.initializeBoard());
	}


}
