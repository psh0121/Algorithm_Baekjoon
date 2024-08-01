import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두자리 합 홀수 : 왼쪽
		// 두자리 합 0아닌 짝수 : 오른쪽
		// 두자리 합 0 : 이전방향
		String before = "";

		while (sc.hasNext()) {
			String code = sc.next();
			if(code.equals("99999")) break;

			int sumFrontTwoNum = Integer.parseInt(code.substring(0, 1))
								+ Integer.parseInt(code.substring(1, 2));

			if(sumFrontTwoNum == 0) {
				System.out.println(before + " " + code.substring(2, 5));
			}
			else if (sumFrontTwoNum % 2 == 0) {
				before = "right";
				System.out.println(before + " " + code.substring(2, 5));
			}
			else {
				before = "left";
				System.out.println(before + " " + code.substring(2, 5));
			}
		}
		sc.close(); 
    }
}
