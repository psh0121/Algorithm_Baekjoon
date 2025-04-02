import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long d = sc.nextLong();
		int c = sc.nextInt();
		int r = sc.nextInt();

		int cnt = 0;

		int[] cArr = new int[c];
		for(int i = 0; i < c; i++) cArr[i] = sc.nextInt();

		int[] rArr = new int[r];
		for(int i = 0; i < r; i++) {
			rArr[i] = sc.nextInt();
			d += (long)rArr[i];
			cnt++;
		}

		for(int i = 0; i < c; i++) {
			if(d < cArr[i]) break;

			d -= (long)cArr[i];
			cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}
