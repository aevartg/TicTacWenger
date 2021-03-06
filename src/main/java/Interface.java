import java.io.*;

public class Interface 
{
	public static final int BOARDSIZE = 3;

	// Prompt the user to enter a integer
	// Returns integer which is compatible for TicTacToe board 
	public static int getInput(char[][] arr, char player) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Player " + player + ", choose a number between 1 - 9: ");
		
		int result = 0;
		

		try
		{
			// Throws exception if input is not a integer
			result = Integer.parseInt(in.readLine());

			if(result <= 9 && result >= 1) 
			{
				result = result - 1;

				// Checks whether input position is valid or not
				if(arr[result/3][result%3] == 'X' || arr[result/3][result%3] == 'O')
				{
					System.out.println("This board position is taken!");
					return getInput(arr, player);
				}
			}
			else 
			{
				System.out.println("The number has to be between 1 - 9!");
				return getInput(arr, player);
			}
		}
		catch (NumberFormatException e)
		{
			System.out.println("Input was not a integer.");
			return getInput(arr, player);
		}
		
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
      		System.out.println("Winner is: " + winner + "!");
    	}
    	else
    	{
      		System.out.println("Draw!");
    	}
	}
}
