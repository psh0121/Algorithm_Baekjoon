import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int minValue = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    int value = Math.abs(arr[i] - arr[j]);
                    minValue = Math.min(minValue, value);
                }
            }

            System.out.println(minValue);
        }
        sc.close();
    }
}