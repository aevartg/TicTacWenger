import java.io.*;

public class Domain{

	public static final int BOARDSIZE = 3;

	// implements  the  game tic tiac toe
	public static void playGame() throws IOException
	{
	    char activePlayer = 'X';
	    char gameWinner = 'D';
	    char [][] gameBoard =  initializeBoard();
	    int counter = 0;
	    boolean gameOver = false;

	    while(!gameOver)
	    {
	        if (counter == 9)
                {
		    break;
		}

		Interface.printBoard(gameBoard);
		int input = Interface.getInput(gameBoard,activePlayer);
                updateBoard(gameBoard,activePlayer,input);
		gameWinner = checkStatus(gameBoard);

		if(gameWinner!='D')
		{
			break;
		}

		counter++;
		activePlayer = switchPlayer(activePlayer);
	    }
	    Interface.printBoard(gameBoard);
	    Interface.gameResult(gameWinner);
	}

	// initialize the gameboard and inputs integers int the appropriate location
	public static char [] [] initializeBoard()
	{
	    char [][] gameBoard = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	    return gameBoard;
	}

	// checks the current status on the current gameboard an return winner if any or D if no winner
	public static char checkStatus(char gameBoard[][])
  	{
	    for(int i = 0; i < BOARDSIZE; i++)
	    {
	    	if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2])
	      	{
	      	    return gameBoard[i][0];
	      	}
	      	if(gameBoard[0][i] == gameBoard[1][i] && gameBoard[0][i] == gameBoard[2][i])
	      	{
	      	    return gameBoard[0][i];
	      	}
	    }

	    if(gameBoard[0][0] ==  gameBoard[1][1] && gameBoard[2][2] == gameBoard[0][0] )
	    {
	    	return gameBoard[0][0];
	    }
	    else if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[2][0] == gameBoard[0][2] )
	    {
	    	return gameBoard[0][2];
	    }
	    else
	    {
		return 'D';
	    }
  	}

  	// puts player in specified location on the gameboard and returns the gameboard updated
  	public static char[][] updateBoard(char[][] arr, char player, int number)
  	{
    	    arr[number/3][number%3] = player;
    	    return arr;
  	}

	// switch to the player who has the next move
	public static char switchPlayer(char player)
	{
	    if(player == 'X')
	    {
         	return 'O';
	    }
            else
	    {
		return 'X';
	    }
	}
}
