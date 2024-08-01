import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// i미터 뛰려면 i * i 만큼 에너지 소비
		int n = sc.nextInt();
		long result = 0;
		long stop = 0;

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				stop = sc.nextLong();
				continue;
			}

			long cur = sc.nextLong();

			result += (cur - stop) * (cur - stop);
			stop = cur;
		}

		System.out.println(result);
		sc.close(); 
    }
}
