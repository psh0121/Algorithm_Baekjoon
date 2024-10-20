import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] backet = new int[n+1];
		for(int i = 0; i < backet.length; i++) backet[i] = i;

		for(int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int k = sc.nextInt();

			int cnt = end - start + 1;
			int[] tempArr = new int[cnt];

			for(int j = 0; j < cnt; j++) {
				tempArr[j] = backet[k++];
				if(k > end) k = start;
			}

			int idx = 0;
			for(int j = start; j <= end; j++) {
				backet[j] = tempArr[idx++];
			}
		}

		for(int i = 1; i < backet.length; i++) {
			System.out.print(backet[i] + " ");
		}
		sc.close();
    }
}
