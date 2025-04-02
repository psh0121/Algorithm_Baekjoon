import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int k = sc.nextInt();

    StringBuffer sb = new StringBuffer();

    for(int i = 0; i < m; i++) {
      String line = sc.next();
      StringBuffer miniSB = new StringBuffer();

      for(int j = 0; j < n; j++) {
        miniSB.append(Character.toString(line.charAt(j)).repeat(k));
      }

      miniSB.append("\n");

      sb.append(miniSB.toString().repeat(k));
    }

    System.out.println(sb.toString().trim());
		sc.close();
    }
}
