import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    while (true) {
      String str = sc.nextLine();
      if(str.equals("#")) break;
      int result = 0;

      for(int i = 0; i < str.length(); i++) {
        char letter = str.charAt(i);
        if(letter == ' ') continue;
        result += ((int)letter - 64) * (i+1);
      }

      System.out.println(result);
    }
		sc.close();
    }
}
