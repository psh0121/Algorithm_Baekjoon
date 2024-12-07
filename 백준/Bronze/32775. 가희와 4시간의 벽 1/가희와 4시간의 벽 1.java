import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int f = sc.nextInt();

		System.out.println(s <= f ? "high speed rail" : "flight");
		sc.close();
    }
}
