import java.util.Scanner;

public class Main {
	public static int[][] rotateArr(int n, int[][] arr) {
		int[][] result = new int[n][n];

		for(int i = 0; i < n; i++) {
			int x = 0;
			for(int j = 0; j < n; j++) {
				result[i][j] = arr[x++][(n-1)-i];
			}
		}

		return result;
	}

	public static boolean isRightArr(int n, int[][] arr) {
		boolean result = true;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j != 0 && arr[i][j-1] > arr[i][j]) {
					result = false;
					break;
				}
			}
			if(!result) break;
		}

		if(result) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(j != 0 && arr[j-1][i] > arr[j][i]) {
						result = false;
						break;
					}
				}
				if(!result) break;
			}
		}

		return result;
	}

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int cnt = 0;

		while (true) {
			if(isRightArr(n, arr)) break;

			int[][] newArr = rotateArr(n, arr);
			arr = newArr;
			cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}
