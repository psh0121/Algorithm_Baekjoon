import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(y + " " + 5);
        }

        scanner.close();
    }
}
