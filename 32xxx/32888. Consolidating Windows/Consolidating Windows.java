import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    long s = (long) a * a + (long) b * b;
    double sqrtS = Math.sqrt((double)s);

    System.out.printf("%.8f\n", sqrtS);
		sc.close();
    }
}
