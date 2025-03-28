import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            a[i] = value;
            b[i] = value;
        }
        Arrays.sort(b);

        for(int i = 0; i < n; i++) {
            int num = a[i];
            int compareFront = Math.abs(num - b[0]);
            int compareBack = Math.abs(num - b[n-1]);

            System.out.println(Math.max(compareFront, compareBack));
        }
        sc.close();
    }
}