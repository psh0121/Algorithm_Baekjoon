import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextLong();

		int num = 2;
		long num2 = 0;
		boolean finishFlag = false;

		while (true) {
			long[] modArr = new long[n];

			for(int i = 0; i < n; i++) modArr[i] = arr[i] % num;

			for(int i = 0; i < n; i++) {
				int cnt = 0;
				for(int j = 0; j < n; j++) {
					if(modArr[i] == modArr[j]) cnt++;				
				}

				if((n % 2 == 0 && cnt >= n/2) || (n % 2 == 1 && cnt >= n/2 + 1)) {
					num2 = modArr[i];
					finishFlag = true;
					break;
				}
			}

			if(finishFlag) break;
			num++;
		}

		System.out.println(num + " " + num2);
        sc.close();
    }
}
