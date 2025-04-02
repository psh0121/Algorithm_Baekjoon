import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;

			int yen = 0;

			for(int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if(yen + a > 300) continue;
				else yen += a;
			}

			System.out.println(yen);
		}
		sc.close();
    }
}
