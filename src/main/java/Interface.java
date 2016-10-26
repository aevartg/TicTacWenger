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
  public static void printResult(char winner)
  {
    String result = gameResult(winner);
    print(result);
  }
  public static String gameResult(char winner)
  {
    if(winner == 'X' || winner == 'O')
    {
      return "Winner is: " + winner + "!";
    }
    else
    {
      return "Draw!";
    }
  }
  public static void print(String strengir)
  {
    System.out.print(strengir);
  }
}
