import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[11];

            for(int i = 0; i < n; i++) {
                int value = sc.nextInt();
                int level = sc.nextInt();

                arr[level] = Math.max(arr[level], value);
            }

            boolean containZero = false;

            for(int i = 1; i <= 10; i++) {
                if(arr[i] == 0) {
                    containZero = true;
                    break;
                }
            }

            if(containZero) {
                System.out.println("MOREPROBLEMS");
                continue;
            }

            int sum = 0;

            for(int i = 1; i <= 10; i++) sum += arr[i];

            System.out.println(sum);
        }
        sc.close();
    }
}