import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int originA = sc.nextInt();
			int originB = sc.nextInt();

			int a = originA;
			int b = originB;

			int maxNum = 1;

			while (true) {
				boolean change = false;
				for(int j = 2; j <= Math.min(a, b); j++) {
					if(a % j == 0 && b % j == 0) {
						maxNum *= j;
						a /= j;
						b /= j;

						change = true;
						break;
					}
				}

				if(!change) break;
			}

			int minNum = maxNum * (originA/maxNum) * (originB/maxNum);

			System.out.println(minNum + " " + maxNum);
		}
		sc.close();
    }
}
