import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 시작은 1번
		// 염소를 보여주면 선택바꿔
		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if(num != 1) cnt++;
		}

		System.out.println(cnt);
		sc.close(); 
    }
}
