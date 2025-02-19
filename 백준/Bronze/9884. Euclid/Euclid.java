import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tempA = 0;
        int tempB = 0;

        while (a != b) {
            tempA = Math.abs(a - b);
            tempB = Math.min(a, b);

            a = tempA;
            b = tempB;
        }

        System.out.println(b);
        sc.close();
    }
}
