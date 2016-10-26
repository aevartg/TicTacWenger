public class Interface
{
  public static void gameResult(char winner)
  {
    if(winner != 'X' || winner != 'O')
    {
      System.out.print("Draw!");
    }
  }
}
