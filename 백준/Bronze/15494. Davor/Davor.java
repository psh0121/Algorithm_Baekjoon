import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int x = 101;
        int k = 0;

        // 식) x + 3k = money / (52*7)
        int calValue = money / (52*7);

        while (x > 100) {
            k++;
            x = calValue - (3*k);
        }

        System.out.println(x);
        System.out.println(k);
        sc.close();
    }
}