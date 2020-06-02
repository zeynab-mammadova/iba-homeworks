package homeworks.homework12.console;

import java.io.PrintStream;
import java.util.Scanner;

public class SystemConsole implements Console {

  private final Scanner in = new Scanner(System.in);
  private final PrintStream out = System.out;

  @Override
  public void printLn(String s) {
    out.println(s);
  }

  @Override
  public String readLn() {
    return in.nextLine();
  }
}
