import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 인원
		int m = sc.nextInt();	// 시작
		int k = sc.nextInt();	// 호출모

		// 두부채우기
		int[] arr = new int[n + 1];
		int num = 3;

		for(int i = m; i <= n; i++) {
			if(arr[i] != 0) break;

			arr[i] = num++;

			if(i == n) i = 0;
		}

		int value = 0;

		for(int i = 1; i <= n; i++) {
			int cur = arr[i];

			if(cur == k) {
				value = i;
				break;
			}

			if(cur > k) {
				while (cur > k) {
					cur -= n;
					if(cur == k) value = i;
				}
			}
			else {
				while (cur < k) {
					cur += n;
					if(cur == k) value = i;
				}
			}

			if(value != 0) break;
		}

		System.out.println(value);

		sc.close();
    }
}