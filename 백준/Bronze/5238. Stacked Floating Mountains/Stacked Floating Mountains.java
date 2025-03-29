import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            String result = "YES";

            for(int i = 2; i < n; i++) {
                if(arr[i-2] + arr[i-1] != arr[i]) {
                    result = "NO";
                    break;
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}