import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int one = 0;
		int zero = 0;

		for(int i = 0; i < n; i++) {
			int coin = sc.nextInt();

			if(coin == 1) one++;
			else zero++; 
		}

		System.out.println(Math.min(one, zero));
		sc.close(); 
    }
}
