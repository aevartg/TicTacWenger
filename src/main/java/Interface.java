import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Interface
{
  public static void printResult(char winner)
  {
    String result = gameResult(winner);
    print(result);
  }
  public static String gameResult(char winner)
  {
    if(winner != 'X' || winner != 'O')
    {
      return "Draw!";
    }
    return "";
  }
  public static void print(String hallo)
  {
    System.out.print(hallo);
  }
}
