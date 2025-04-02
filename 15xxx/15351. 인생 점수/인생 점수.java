import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < n; i++) {
      String str = sc.nextLine();
      int grade = 0;

      for(int j = 0; j < str.length(); j++) {
        char letter = str.charAt(j);
        if(letter == ' ') continue;

        grade += (int)letter - 64;
      }

      System.out.println(grade == 100 ? "PERFECT LIFE" : grade); 
    }
		sc.close();
    }
}
