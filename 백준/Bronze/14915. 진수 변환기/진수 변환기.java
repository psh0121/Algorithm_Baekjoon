import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    String value = Integer.toUnsignedString(m, n);
    System.out.println(value.toUpperCase());
		sc.close();
    }
}
