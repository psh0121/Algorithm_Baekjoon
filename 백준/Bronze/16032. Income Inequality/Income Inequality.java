import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;
            int[] arr = new int[n];
            int sum = 0;

            for(int i = 0; i < arr.length; i++) {
                int num = sc.nextInt();
                sum += num;
                arr[i] = num;
            }

            double avg = (double)sum / n;

            int cnt = 0;

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] <= avg) cnt++;
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}