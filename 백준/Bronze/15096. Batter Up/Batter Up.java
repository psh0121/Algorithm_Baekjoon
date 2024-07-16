import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num != -1) {
				cnt++;
				sum += num;
			}
		}

		System.out.println((double)sum / cnt);
		sc.close();
    }
}