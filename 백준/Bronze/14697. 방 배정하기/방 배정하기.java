import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();

		boolean possible = false;
		for(int i = 0; i <= n / a; i++) {
			for(int j = 0; j <= n / b; j++) {
				for(int k = 0; k <= n / c; k++) {
					if(a*i + b*j + c*k == n) {
						possible = true;
						break;
					}
				}
				if(possible) break;
			}
			if(possible) break;
		}

		System.out.println(possible ? 1 : 0);
		sc.close();
    }
}
