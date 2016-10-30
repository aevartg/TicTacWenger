import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest
{


    // Test right result
    @Test
    public void testCheckStatus()
    {
        char gameBoard[][] = {{'X','X','3'},{'4','O','6'},{'X','O','O'}};
        char gameBoard2[][] = {{'X','X','X'},{'4','O','6'},{'7','8','O'}};
        char gameBoard3[][] = {{'X','O','3'},{'4','O','X'},{'X','O','O'}};
        char gameBoard4[][] = {{'X','X','O'},{'X','O','O'},{'X','O','X'}};
        char gameBoard5[][] = {{'O','O','X'},{'X','X','O'},{'O','X','X'}};
        char gameBoard6[][] = {{'X','X','3'},{'4','X','6'},{'O','O','O'}};
    	char gameBoard7[][] = {{'X','O','O'},{'O','X','X'},{'7','O','X'}};
    	char gameBoard8[][] = {{'X','X','O'},{'4','O','X'},{'O','8','9'}};
	char gameBoard9[][] = {{'X','O','X'},{'X','O','X'},{'O','X','O'}};

        char r1,r2,r3,r4,r5,r6,r7,r8,r9;
        r1 = Domain.checkStatus(gameBoard);
        r2 = Domain.checkStatus(gameBoard2);
        r3 = Domain.checkStatus(gameBoard3);
        r4 = Domain.checkStatus(gameBoard4);
        r5 = Domain.checkStatus(gameBoard5);
        r6 = Domain.checkStatus(gameBoard6);
        r7 = Domain.checkStatus(gameBoard7);
        r8 = Domain.checkStatus(gameBoard8);
	r9 = Domain.checkStatus(gameBoard9);

        assertEquals('D',r1);
        assertEquals('X',r2);
        assertEquals('O',r3);
        assertEquals('X',r4);
        assertEquals('D',r5);
        assertEquals('O',r6);
        assertEquals('X',r7);
        assertEquals('O',r8);
	assertEquals('D',r9);
	}

    @Test
    public void testInitialGameboard()
    {
	char[][] compareisonBoard = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	assertEquals (compareisonBoard,Domain.initializeBoard());
    }

    // Tests whether updateBoard returns the right double array
    @Test
    public void testUpdateBoard()
    {
    	char x = 'X';
    	char o = 'O';
    	char[][] gameBoard1 = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    	char[][] changedGameBoard1 = {{'1','2','3'},{'4','5','X'},{'7','8','9'}};

    	char[][] gameBoard2 = {{'X','2','O'},{'4','5','X'},{'7','8','9'}};
    	char[][] changedGameBoard2 = {{'X','2','O'},{'4','O','X'},{'7','8','9'}};

    	char[][] r1 = Domain.updateBoard(gameBoard1, x, 6-1);
    	char[][] r2 = Domain.updateBoard(gameBoard2, o, 5-1);

    	assertEquals(changedGameBoard1, r1);
    	assertEquals(changedGameBoard2, r2);
    }

    @Test
    public void testSwitchPlayerOne()
    {
	assertEquals('O',Domain.switchPlayer('X'));
    }

    @Test
    public void testSwitchPlayerTwo()
    {
	assertEquals('X',Domain.switchPlayer('O'));
    }
}
