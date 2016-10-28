public class Domain{

	public static final int BOARDSIZE = 3;

	public static void playGame()
	{
		char activePlayer = 'x';
		boolean gameOver = false;
		while(!gameOver)
		{
			//function calls
		}

	}


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
                        return 'N';
                }

        }

        public static char[][] updateBoard(char[][] arr, char player, int number) 
        {
                arr[number/3][number%3] = player;
                
                return arr;
        }



}
