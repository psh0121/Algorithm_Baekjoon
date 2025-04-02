import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 0;
		long curAngry = 0;

		for(int i = 0; i < n; i++) {
			int angry = sc.nextInt();

			if(angry == 0) curAngry--;
			else curAngry++;

			result += curAngry;
		}

		System.out.println(result);

		sc.close();
    }
}
