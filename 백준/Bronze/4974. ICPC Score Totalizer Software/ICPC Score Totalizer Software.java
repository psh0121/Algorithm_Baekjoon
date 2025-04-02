import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int sum = 0;
            Arrays.sort(arr);

            for(int i = 1; i < n-1; i++) sum += arr[i];

            System.out.println(sum / (n-2));
        }
        sc.close();
    }
}