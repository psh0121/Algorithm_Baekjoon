import java.util.Scanner;

public class Main {
    public static boolean containLenZero(StringBuilder[] arr) {
        for(StringBuilder sb : arr) {
            if(sb.length() == 0) return true;
        }
        return false;
    }

    public static boolean containSame(StringBuilder[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i].toString().equals(arr[j].toString())) return true;
            }
        }

        return false;
    }

    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            StringBuilder[] arr = new StringBuilder[n];
            for(int i = 0; i < n; i++) arr[i] = new StringBuilder(sc.next());

            int num = 0;

            while (true) {
                for(int i = 0; i < arr.length; i++) arr[i].deleteCharAt(0);
                
                if(containLenZero(arr) || containSame(arr)) break;

                num++;
            }

            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
