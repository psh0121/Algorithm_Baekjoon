import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		// 1달러지폐 M개의 지폐를 한묶음
		// 묶음 세어가면서 M개의 묶음을 하나로
		// 더이상 묶음이 만들어지지 않을때까지 과정 반복

		int n = sc.nextInt();
		int m = sc.nextInt();

		int cnt = n;

		while(true) {
			if(n / m == 0) break;

			cnt += n / m;

			n = n / m;
		}

		System.out.println(cnt);

		sc.close();
    }
}
