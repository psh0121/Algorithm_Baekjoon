import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int level = Integer.MAX_VALUE;
		String result = "";

		for(int i = 0; i < n; i++) {
			String value = sc.next();
			int num = sc.nextInt();

			if(num < level) {
				level = num;
				result = value;
			}
		}

		System.out.println(result);
		sc.close();
    }
}
