import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int num = sc.nextInt();
      int result = 0;

      for(int j = 1; j < num; j++) {
        if(num % j == 0) result += j;
      }

      if(result == num) System.out.println("Perfect");
      else if(result < num) System.out.println("Deficient");
      else System.out.println("Abundant");
    }
		sc.close();
    }
}
