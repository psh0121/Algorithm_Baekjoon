import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            int value = 0;

            for(int j = 1; j <= n; j++) {
                sum += j;
                value += sum;
            }

            System.out.println(i + ": " + n + " " + value);
        }
        sc.close();
    }
}