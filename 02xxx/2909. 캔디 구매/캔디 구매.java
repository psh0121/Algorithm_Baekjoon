import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
    int k = sc.nextInt();

    double tenPowK = Math.pow(10, k);
    double num = c / tenPowK;
    num = Math.round(num) * tenPowK;

    System.out.println((int)num);
		sc.close();
    }
}
