import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < q; i++) {
            int sum = 0;
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start; j <= end; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
