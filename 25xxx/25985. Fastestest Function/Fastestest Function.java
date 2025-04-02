import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double calValue = (x / y) / ((100-x) / (100-y));

        System.out.println(calValue);
        sc.close();
    }
}