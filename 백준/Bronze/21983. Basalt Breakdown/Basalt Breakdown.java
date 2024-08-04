import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double result = Math.sqrt((a * 2) / (3 * Math.sqrt(3))) * 6;

		System.out.println(result);
		sc.close(); 
    }
}
