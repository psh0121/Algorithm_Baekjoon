import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String valueArr = sc.next();
		int cnt = 0;

		int curBall = 1;

		for(int i = 0; i < n; i++) {
			char value = valueArr.charAt(i);

			if(value=='L') {
				if(curBall != 1) curBall--;
			}
			else {
				if(curBall != 3) curBall++;
			}

			if(curBall == 3) cnt++;
		}

		System.out.println(cnt);
		sc.close(); 
    }
}
