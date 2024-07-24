import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int startNum = -1;

		for(int i = 0; i < n; i++) {
			if(startNum == -1) {
				startNum = sc.nextInt();
				continue;
			}

			int num = sc.nextInt();

			if(num % startNum == 0) {
				System.out.println(num);
				startNum = -1;
			}
		}
		sc.close();
    }
}
