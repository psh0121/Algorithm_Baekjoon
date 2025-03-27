import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int start = sc.nextInt();
            int one = sc.nextInt();
            int two = sc.nextInt();
            int three = sc.nextInt();

            if(start == 0 && one == 0 && two == 0 && three == 0) break;

            int cur = start;

            int value = 0;
            value += 360 * 2;
            value += ((cur - one + 40) % 40) * 9;
            cur = one;

            value += 360 * 1;
            value += ((two - cur + 40) % 40) * 9;
            cur = two;

            value += ((cur - three + 40) % 40) * 9;

            System.out.println(value);
        }
        sc.close();
    }
}