import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int point = 0;

			int[] leftB = new int[n];
			int[] rightB = new int[n];

			for(int j = 0; j < n; j++) {
				leftB[j] = sc.nextInt();
				rightB[j] = sc.nextInt();
			}

			for(int j = 0; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					if ((leftB[j] < leftB[k] && rightB[j] > rightB[k]) ||
                        (leftB[j] > leftB[k] && rightB[j] < rightB[k])) {
                        point++;
                    }
				}
			}

			System.out.println("Case #" + i + ": " + point);
		}
        sc.close();
    }
}
