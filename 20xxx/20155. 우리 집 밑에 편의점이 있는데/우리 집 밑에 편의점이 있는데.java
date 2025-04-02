import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] arr = new Integer[m+1];
        for(int i = 0; i < arr.length; i++) arr[i] = 0;

        for(int i = 0; i < n; i++) {
          arr[sc.nextInt()]++;
        }

        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println(arr[0]);
        sc.close();
    }
}