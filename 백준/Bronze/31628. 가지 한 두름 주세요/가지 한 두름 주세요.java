import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[10][10];

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				arr[i][j] = sc.next();
			}
		}

		// 가로
		for(int i = 0; i < 10; i++) {
			String value = arr[i][0];
			boolean isSame = true;
			
			for(int j = 1; j < 10; j++) {
				if(!arr[i][j].equals(value)) {
					isSame = false;
					break;
				}
			}

			if(isSame) {
				System.out.println(1);
				return;
			}
		}

		// 세로
		for(int i = 0; i < 10; i++) {
			String value = arr[0][i];
			boolean isSame = true;

			for(int j = 1; j < 10; j++) {
				if(!arr[j][i].equals(value)) {
					isSame = false;
					break;
				}
			}

			if(isSame) {
				System.out.println(1);
				return;
			}
		}

		System.out.println(0);
		sc.close();
    }
}