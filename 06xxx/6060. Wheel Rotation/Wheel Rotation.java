import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];

        for(int i = 0; i < n-1; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();

            arr[s-1] = c;
        }

        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                if(result == 1) result = 0;
                else result = 1;
            }
        }

        System.out.println(result);
        sc.close();
    }
}