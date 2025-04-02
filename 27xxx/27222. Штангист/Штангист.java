import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] exArr = new int[n];
        for(int i = 0; i < n; i++) exArr[i] = sc.nextInt();

        int result = 0;
        for(int i = 0; i < n; i++) {
            int before = sc.nextInt();
            int after = sc.nextInt();

            if(exArr[i] == 0) continue;

            if(after - before > 0) result += after - before;
        }

        System.out.println(result);
        sc.close();
    }
}