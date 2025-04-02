import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < n; i++) {
      String code = sc.nextLine();
      String alphabet = sc.nextLine();

      String result = "";

      for(int j = 0; j < code.length(); j++) {
        char letter = code.charAt(j);
        if(letter == ' ') result += " ";
        else {
          int asciiLetter = (int)letter - 65;
          result += alphabet.charAt(asciiLetter);
        }
      }

      System.out.println(result);
    }
		sc.close();
    }
}
