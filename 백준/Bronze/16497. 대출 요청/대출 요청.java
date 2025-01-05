import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] days = new int[32];

        for(int i = 0; i < n; i++) {
          int s = sc.nextInt();
          int e = sc.nextInt();

          for(int j = s; j < e; j++) {
            days[j]++;
          }
        }

        int k = sc.nextInt();

        for(int i = 0; i < 32; i++) {
          if(days[i] > k) {
            System.out.println(0);
            return;
          }
        }

        System.out.println(1);
        sc.close();
    }
}