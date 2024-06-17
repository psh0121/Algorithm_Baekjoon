import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);

		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			String[] tempArr = sc.nextLine().split(" ");
			
			for(int j = 0; j < tempArr.length; j++) {
				arr[i][j] = Integer.parseInt(tempArr[j]);
			}
		}

		int jinSeo = arr[a-1][b-1];

		// 행 분석
		for(int i = 0; i < n; i++) {
			if(i == b - 1) continue;
			
			if(arr[a-1][i] > jinSeo) {
				System.out.println("ANGRY");
				return;
			}
		}

		// 열 분석
		for(int i = 0; i < n; i++) {
			if(i == a - 1) continue;

			if(arr[i][b - 1] > jinSeo) {
				System.out.println("ANGRY");
				return;
			}
		}

		System.out.println("HAPPY");
		sc.close();
    }
}