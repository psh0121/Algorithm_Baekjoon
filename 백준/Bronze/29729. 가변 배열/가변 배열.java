import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();

		int lightCnt = 0;

		for(int i = 0; i < n+m; i++) {
			int light = sc.nextInt();
			
			if(light == 1) lightCnt++;
			else lightCnt--;

			if(lightCnt > size) size *= 2;
		}

		System.out.println(size);
		
		sc.close();
    }
}