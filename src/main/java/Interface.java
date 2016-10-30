import java.io.*;

public class Interface 
{
	public static final int BOARDSIZE = 3;

	// Prompt the user to enter a integer
	// Returns integer which is compatible for TicTacToe board 
	public static int getInput(char[][] arr, char player) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		
		System.out.print("Player " + player + ", choose a number between 1 - 9: ");
		
		int result = 0;
		
		do
		{
			try
			{
				// Throws exception if input is not a integer
				result = Integer.parseInt(in.readLine());
				valid = true;

				if(result <= 9 && result >= 1) 
				{
					result = result - 1;

					// Checks whether input position is valid or not
					if(arr[result/3][result%3] == 'X' || arr[result/3][result%3] == 'O')
					{
						System.out.print("This board position is taken! Choose another number between 1 - 9: ");
					}
					else
					{
						valid = true;
					}
				}
				else 
				{
					System.out.print("The number has to be between 1 - 9! Choose another number between 1 - 9: ");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.print("Input was not a integer. Choose a number between 1 - 9: ");
			}
		}while(!valid);
		
		return result;
	}

	// Prints out TicTacToe board in console
  	public static void printBoard(char gameBoard[][])
  	{
        for(int i = 0; i < BOARDSIZE; i++)
        {
        	for(int j = 0; j < BOARDSIZE; j++)
        	{
                System.out.print(gameBoard[i][j] + " ");
        	}
        	System.out.print("\n");
        }
  	}

  	// Prints out TicTacToe winner or a draw.
  	public static void gameResult(char winner)
  	{
    	if(winner == 'X' || winner == 'O')
    	{
      		System.out.print("Winner is: " + winner + "!");
    	}
    	else
    	{
      		System.out.print("Draw!");
    	}
	}
}
