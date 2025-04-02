import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int line = 1;
    while (true) {
      String s = sc.nextLine();
      if(s.equals("Was it a cat I saw?")) break;
      String result = "";

      for(int i = 0; i < s.length(); i += (line + 1)) {
        result += s.charAt(i);
      }

      System.out.println(result);
      line++;
    }
		sc.close();
    }
}
