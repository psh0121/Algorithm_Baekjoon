import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int rail = sc.nextInt();
		int flight = sc.nextInt() + sc.nextInt() + sc.nextInt();

		System.out.println(rail <= flight || rail <= 240 ? "high speed rail" : "flight");
		sc.close();
    }
}
