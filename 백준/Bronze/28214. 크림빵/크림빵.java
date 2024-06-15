import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();

		int[] bread = new int[n * k];

		for(int i = 0; i < bread.length; i++) {
			bread[i] = sc.nextInt();
		}

		int cnt = n;

		// 불량빵 파악하기 
		int curIdx = 0;

		for(int i = 0; i < n; i++) {
			int zeroCnt = 0;

			for(int j = 0; j < k; j++) {
				if(bread[curIdx++] == 0) zeroCnt++;
			}

			if(zeroCnt >= p) cnt--;
		}

		System.out.println(cnt);
		sc.close();
    }
}