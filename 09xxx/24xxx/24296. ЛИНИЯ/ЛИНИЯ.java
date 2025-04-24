import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = n;

		while (true) {
			if(result % 2 == 0) break;

			result = result / 2 + 1;
		}

		System.out.println(result);
		sc.close(); 
    }
}
