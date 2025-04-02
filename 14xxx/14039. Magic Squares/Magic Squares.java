import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3];

		// row sum
		for(int i = 0; i < 4; i++) {
			int value = arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
			
			if(sum != value) {
				System.out.println("not magic");
				return;
			}
		}

		// col sum
		for(int i = 0; i < 4; i++) {
			int value = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];

			if(sum != value) {
				System.out.println("not magic");
				return;
			}
		}

		System.out.println("magic");
		sc.close();
    }
}
