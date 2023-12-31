import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 행  
		int M = sc.nextInt();	// 렬 
		
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		
		int[][] resultArr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// 더하기 
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				resultArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		// 출력
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				System.out.print(resultArr[i][j] + " ");
			}
			System.out.println();
		}

	}

}