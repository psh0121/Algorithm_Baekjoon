import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int t = sc.nextInt();

    int minValue = Integer.MAX_VALUE;
    int result = Integer.MAX_VALUE;

    for(int i = 1; i <= t; i++) {
      int f = sc.nextInt();
      int d = sc.nextInt();

      int moveTime = (m+1) - d + f-1;
      if(moveTime <= minValue) {
        if(moveTime == minValue) result = Math.min(result, i);
        else {
          minValue = Math.min(minValue, moveTime);
          result = i;
        }
      }
    }

    System.out.println(result);
		sc.close();
    }
}
