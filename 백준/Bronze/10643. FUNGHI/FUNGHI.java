import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int[] pizza = new int[8];
    for(int i = 0; i < 8; i++) pizza[i] = sc.nextInt();

    int result = 0;

    for(int i = 0; i < 8; i++) {
      int curCnt = pizza[i % 8] + pizza[(i+1) % 8] + pizza[(i+2) % 8] + pizza[(i+3) % 8];

      result = Math.max(result, curCnt);
    }

    System.out.println(result);
		sc.close();
    }
}
