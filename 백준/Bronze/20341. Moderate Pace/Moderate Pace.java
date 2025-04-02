import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();
        for(int i = 0; i < n; i++) c[i] = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int[] arr = {a[i], b[i], c[i]};
            Arrays.sort(arr);

            sb.append(arr[1] + " ");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}