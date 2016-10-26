public class Interface
{
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
