import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(
            (a == 0 && x != 0) ||
            (b == 0 && y != 0) ||
            (a == 0 && x == 0 && b < y) ||
            (b == 0 && y == 0 && a < x)
            ) System.out.println(1);
        else if(
            (a == x && b < y) ||
            (b == y && a < x) ||
            (a != x && b != y)
        ) System.out.println(2);
        else System.out.println(3);
        sc.close();
    }
}
