import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int[] keyboard = new int[n+1];
		for(int i = 1; i <= n; i++) keyboard[i] = sc.nextInt();

		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int idx = sc.nextInt();
			keyboard[idx]--;
		}

		for(int i = 1; i <= n; i++) {
			if(keyboard[i] >= 0) System.out.println("no");
			else System.out.println("yes");
		}
        sc.close();
    }
}
