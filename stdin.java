import java.util.ArrayList;
import java.util.Scanner;

class StdIn {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String input_text;
    ArrayList<String> lines = new ArrayList<String>();
    while (scanner.hasNextLine()) {
      input_text = scanner.nextLine();
      lines.add(input_text);
    }
    System.out.println(lines);
    scanner.close();
  }
}