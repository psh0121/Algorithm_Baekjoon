import java.util.Scanner;

public class Main {
    public static String solve(int n) {
        StringBuilder result = new StringBuilder();
        int totalLen = n * 2;
        int starCnt = 1;

        for(int i = 0; i <= n/2; i++) {
            String value = "";
            value += "*".repeat(starCnt);
            value += " ".repeat(totalLen - (starCnt * 2));
            value += "*".repeat(starCnt);

            result.append(value + "\n");

            starCnt += 2;
        }

        starCnt -= 4;

        for(int i = 0; i <= n/2 - 1; i++) {
            String value = "";

            value += "*".repeat(starCnt);
            value += " ".repeat(totalLen - (starCnt * 2));
            value += "*".repeat(starCnt);

            result.append(value + "\n");

            starCnt -= 2;
        }

        return result.toString().trim();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solve(n));
        sc.close();
    }
}
