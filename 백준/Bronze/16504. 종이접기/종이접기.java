import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long[][] arr = new long[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		while (size > 1) {
			int newSize = size / 2;

			// 좌우로 접기
			long[][] halfArr = new long[size][newSize];

			for(int i = 0; i < size; i++) {
				for(int j = 0; j < newSize; j++) {
					halfArr[i][j] = arr[i][j] + arr[i][size - 1 - j];
				}
			}

			// 상하로 접기
			long[][] finalArr = new long[newSize][newSize];

			for(int i = 0; i < newSize; i++) {
				for(int j = 0; j < newSize; j++) {
					finalArr[i][j] = halfArr[i][j] + halfArr[size - 1 - i][j];
				}
			}

			arr = finalArr.clone();
			size = newSize;
		}

		System.out.println(arr[0][0]);

		sc.close();
    }
}