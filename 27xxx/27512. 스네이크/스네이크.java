import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.println(n%2 == 1 && m%2 == 1 ? n*m - 1 : n*m);
		sc.close();
    }
}
