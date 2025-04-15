import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String[] strArr = sc.nextLine().split(", ");
            int[] arr = new int[strArr.length];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 4 == 0) sb.append(arr[i]).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}