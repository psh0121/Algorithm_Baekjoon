import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int degree = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++) {
          int newDegree = sc.nextInt();
          int value1 = Math.abs(newDegree - degree);
          int value2 = 360 - value1;

          sum += Math.min(value1, value2);

          degree = newDegree;
        }

        System.out.println(sum);
        sc.close();
    }
}