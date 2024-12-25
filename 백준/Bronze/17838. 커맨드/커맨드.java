import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      String s = sc.next();

      if(s.length() != 7) {
        System.out.println(0);
        continue;
      }

      String a = Character.toString(s.charAt(0));
      String b = Character.toString(s.charAt(2));

      if(a.equals(b)) {
        System.out.println(0);
        continue;
      }

      String command = a + a + b + b + a + b + b;

      System.out.println(s.equals(command) ? 1 : 0);
    }
		sc.close();
    }
}
