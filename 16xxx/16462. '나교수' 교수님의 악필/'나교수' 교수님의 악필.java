import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for(int i = 0; i < n; i++) {
      String num = sc.next();
      num = num.replaceAll("[069]", "9");

      int score = Math.min(100, Integer.parseInt(num));
      sum += score; // 총합 계산
    }

    int avg = (int) Math.round((double)sum / n);

    System.out.println(avg);
		sc.close();
    }
}
