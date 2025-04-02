import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		// num이 100보다 작으면 무조건 99 출력
		if(Integer.parseInt(num) < 100) {
			System.out.println(99);
			return;
		}

		// 뒷자리 2자뺀 나머지 숫자를 추출한다
		int outTwoNum = Integer.parseInt(num.substring(0, num.length() - 2));

		// 뒷자리 2자리뺀 숫자 + 99 와 (뒷자리 2자리뺀 숫자 - 1) + 99 만들기
		int overNum = Integer.parseInt(Integer.toString(outTwoNum) + "99");
		int underNum = Integer.parseInt(Integer.toString(outTwoNum - 1) + "99");

		// 어느 숫자가 num의 차중에서 더 적은가?
		if(Math.abs(underNum - Integer.parseInt(num)) < Math.abs(overNum - Integer.parseInt(num))) {
			System.out.println(underNum);
		}
		else System.out.println(overNum);

		sc.close();
    }
}
