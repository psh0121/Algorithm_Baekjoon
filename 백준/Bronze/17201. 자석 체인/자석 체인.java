import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    char before = str.charAt(0);
    char cur;

    String result = "Yes";

    for(int i = 1; i < str.length(); i++) {
      cur = str.charAt(i);

      if(before == cur) {
        result = "No";
        break;
      }

      before = cur;
    }

    System.out.println(result);
		sc.close();
    }
}
