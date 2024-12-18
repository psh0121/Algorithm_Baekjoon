import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int result = 0;

    int cur = 1;  // A

    for(int i = 0; i < str.length(); i++) {
      int purpose = (int)str.charAt(i) - 64;
      int right = 0;
      int left = 0;

      if(cur < purpose) {
        right = purpose - cur;
        left = (cur + 26) - purpose;
      }
      else {
        right = (26-cur) + purpose;
        left = cur - purpose;
      }

      result += Math.min(right, left);
      cur = purpose;
    }

    System.out.println(result);
		sc.close();
    }
}
