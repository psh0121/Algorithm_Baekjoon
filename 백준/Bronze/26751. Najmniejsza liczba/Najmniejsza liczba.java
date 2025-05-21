import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);

        int zeroCnt = 0;
        for(int i = 0; i < arr.length; i++) if(arr[i] == 0) zeroCnt++;

        if(zeroCnt == 1) System.out.println("" + arr[1] + arr[0] + arr[2]);
        else if(zeroCnt == 2) System.out.println("" + arr[2] + arr[0] + arr[1]);
        else System.out.println("" + arr[0] + arr[1] + arr[2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
