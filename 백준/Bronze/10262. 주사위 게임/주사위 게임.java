import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
    int a2 = sc.nextInt();
    int b2 = sc.nextInt();

    int a3 = sc.nextInt();
    int b3 = sc.nextInt();
    int a4 = sc.nextInt();
    int b4 = sc.nextInt();

    int sumA12 = a1 + a2;
    int sumB12 = b1 + b2;
    int sumA34 = a3 + a4;
    int sumB34 = b3 + b4;

    int value = sumA12-sumA34 + sumB12-sumB34;

    if(value == 0) System.out.println("Tie");
    else if(value > 0) System.out.println("Gunnar");
    else System.out.println("Emma");
		sc.close();
    }
}
