import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 1;

		for(int i = 1; i <= n; i++) {
			StringBuilder result = new StringBuilder();
			for(int j = 1; j <= m; j++) {
				if(j == m) {
					result.append(num++);
				}
				else result.append(num++).append(" ");
			}

			System.out.println(result.toString());
		}
    	sc.close();
    }
}