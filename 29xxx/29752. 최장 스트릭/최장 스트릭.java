import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxStrick = Integer.MIN_VALUE;
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if(num == 0) {
				maxStrick = Math.max(maxStrick, cnt);
				cnt = 0;
			}
			else {
				cnt++;
			}
		}

		maxStrick = Math.max(maxStrick, cnt);

		System.out.println(maxStrick);
		sc.close();
    }
}