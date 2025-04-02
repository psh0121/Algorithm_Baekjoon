import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nArr = new int[n];
        int[] mArr = new int[m];

        for(int i = 0; i < n; i++) nArr[i] = sc.nextInt();
        for(int i = 0; i < m; i++) mArr[i] = sc.nextInt();

        int result = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                result += (nArr[i] + mArr[j]) * Math.max(nArr[i], mArr[j]);
            }
        }

        System.out.println(result);
        sc.close();
    }
}