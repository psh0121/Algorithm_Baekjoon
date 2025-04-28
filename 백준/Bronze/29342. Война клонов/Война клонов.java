import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

       long even = 0;
       long odd = 0;

       for(int i = 0; i < n; i++) {
        if(arr[i] % 2 == 0) even++;
        else odd++;
       }

       System.out.println(even * odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
