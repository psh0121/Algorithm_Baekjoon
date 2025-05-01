import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        String binaryNum = sc.next();
        String newNum = "";
        newNum += binaryNum.charAt(0);

        for(int i = 1; i < n; i++) {
            char before = binaryNum.charAt(i-1);
            char cur = binaryNum.charAt(i);

            if((before == '0' && cur == '0') || (before == '1' && cur == '1')) {
                newNum += '0';
            }
            else newNum += '1';
        }

        System.out.println(newNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
