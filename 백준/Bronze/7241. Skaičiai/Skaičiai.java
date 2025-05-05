import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int[] arr = {
            Integer.parseInt(a+b+c), Integer.parseInt(a+c+b),
            Integer.parseInt(b+a+c), Integer.parseInt(b+c+a),
            Integer.parseInt(c+a+b), Integer.parseInt(c+b+a),
        };

        Arrays.sort(arr);

        int num = sc.nextInt();

        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                idx = (i+1);
                break;
            }
        }

        System.out.println(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
