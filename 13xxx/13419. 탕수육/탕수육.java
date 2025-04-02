import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      String str = sc.next();
      if(str.length() == 1) {
        System.out.println(str);
        System.out.println(str);
        continue;
      }

      String a = "";
      String b = "";

      for(int j = 0; j < str.length(); j++) {
        if(j % 2 == 0) a += str.charAt(j);
        else b += str.charAt(j);
      }

      if(str.length() % 2 == 1) {
        for(int j = 0; j < str.length(); j++) {
          if(j % 2 == 0) b += str.charAt(j);
          else a += str.charAt(j);
        }
      }

      System.out.println(a);
      System.out.println(b);
    }
		sc.close();
    }
}
