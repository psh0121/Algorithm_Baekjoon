import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		for(int i = 1; i <= k; i++) {
			int l = sc.nextInt();
			int n = sc.nextInt();
			
			int[] lionArr = new int[n];
			for(int j = 0; j < n; j++) lionArr[j] = sc.nextInt();

			int genCnt = 0;

			while (true) {
				if(lionArr[l-1] == 0) {
					genCnt++;
					break;
				}

				genCnt++;
				l = lionArr[l-1];
			}

			System.out.println("Data Set " + i + ":");
			System.out.println(genCnt);
			System.out.println();
		}
		sc.close();
    }
}
