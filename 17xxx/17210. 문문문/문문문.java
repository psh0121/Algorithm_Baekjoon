import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 규칙1) 밀어서열기, 당겨서 열기 방법이 있다.
		// 규칙2) 연속2번 같은방법으로 열수 없음.
		// 규칙3) 2의 배수문은 같은 방법으로 문열어야함
		// 규칙4) 3의 배수 문은 같은 방법으로 문열어야함

		long n = sc.nextLong();
		int door = sc.nextInt();
		
		if(n > 8) {
			System.out.println("Love is open door");
			return;
		}

		for(long i = 2; i <= n; i++) {
			if(door == 1) {
				System.out.println(0);
				door = 0;
			}
			else {
				System.out.println(1);
				door = 1;
			}
		}
		sc.close();
    }
}