import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String str = sc.next();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      String asciLetter = Integer.toString((int)letter);
      int repeatNum = 0;

      for(int j = 0; j < asciLetter.length(); j++) {
        repeatNum += Character.getNumericValue(asciLetter.charAt(j));
      }
      sb.append(Character.toString(letter).repeat(repeatNum)).append("\n");
    }
    System.out.println(sb.toString().trim());
		sc.close();
    }
}
