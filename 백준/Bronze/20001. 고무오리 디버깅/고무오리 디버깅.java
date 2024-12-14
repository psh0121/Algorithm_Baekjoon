import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		while (true) {
			String str = sc.nextLine();
			if(str.equals("고무오리 디버깅 끝")) break;

			if(str.equals("문제")) cnt++;
			else if(str.equals("고무오리")) {
				if(cnt == 0) cnt = 2;
				else cnt--;
			}
		}

		System.out.println(cnt > 0 ? "힝구" : "고무오리야 사랑해");
		sc.close();
    }
}
