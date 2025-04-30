import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.replaceAll(" ", "");
        
        String[] arr = s.split("0");

        int maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            maxLen = Math.max(maxLen, arr[i].length());
        }

        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}