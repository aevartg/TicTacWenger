public class Interface
{
  public static final int boardSize = 3;
  public static void printBoard(char gameBoard[][])
  {
         for(int i = 0; i < boardSize; i++)
         {
                 for(int j = 0; j < boardSize; j++)
                 {
                        System.out.print(gameBoard[i][j] + " ");
                 }
                 System.out.print("\n");
         }
  }
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
