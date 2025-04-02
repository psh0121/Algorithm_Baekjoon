import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
		
		int n = sc.nextInt();
		int[] aArr = new int[n];
		for(int i = 0; i < n; i++) aArr[i] = sc.nextInt();

		int m = sc.nextInt();
		int[] bArr = new int[m];
		for(int i = 0; i < m; i++) bArr[i] = sc.nextInt();

		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int value = aArr[i] + k;
			for(int j = 0; j < m; j++) {
				if(value == bArr[j]) cnt++;
			}
		}

		System.out.println(cnt);
        sc.close();
    }
}
