import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n];
		for(int i = 0; i < n; i++) str[i] = sc.next();

		char letter = str[0].charAt(0);

		int result = 1;

		for(int i = 1; i < n; i++) {
			if(str[i].charAt(0) != letter) {
				result = 0;
				break;
			}
		}

		System.out.println(result);
		sc.close();
    }
}
