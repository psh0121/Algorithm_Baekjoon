import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt() + 1; // 문제 + 연습문제
		
		System.out.println(cnt * 2 + " " + cnt * 3);
	}
}