import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 1;  // 분자
    int b = 1;  // 분모

    for(int i = 2; i <= n; i++) {
      if(a == 1) {
        a = b + 1;
        b = 1;
      }
      else {
        a--;
        b++;
      }
    }

    System.out.println(a + " " + b);
		sc.close();
    }
}
