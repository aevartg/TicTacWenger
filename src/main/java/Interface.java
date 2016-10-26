import java.io.*;

public class Interface {
	public static int getInput(int[][] arr) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		
		System.out.print("Choose a number between 1 - 9: ");
		
		int result = 0;
		
		do
		{
			try
			{
				result = Integer.parseInt(in.readLine());
				valid = true;
			}
			catch (NumberFormatException e)
			{
					System.out.println("Input error - Input has to be a number!");
					System.out.print("Choose a number between 1 - 9: ");
			}
		}while(!valid);
		
		return result;
	}
}