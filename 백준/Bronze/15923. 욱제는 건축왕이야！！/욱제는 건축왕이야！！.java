import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int firstX = 0;
		int firstY = 0;

		int beforeX = 0;
		int beforeY = 0;

		int len = 0;

		for(int i = 0; i < n; i++) {
			int afterX = sc.nextInt();
			int afterY = sc.nextInt();

			if(i == 0) {
				firstX = afterX;
				firstY = afterY;

				beforeX = afterX;
				beforeY = afterY;

				continue;
			}

			len += Math.sqrt(Math.pow(afterX - beforeX, 2) + Math.pow(afterY - beforeY, 2));

			beforeX = afterX;
			beforeY = afterY;
		}

		len += Math.sqrt(Math.pow(firstX - beforeX, 2) + Math.pow(firstY - beforeY, 2));

		System.out.println(len);
		sc.close();
    }
}