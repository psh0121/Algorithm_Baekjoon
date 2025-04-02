import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 과자 리스트 - S, N, U
		// 가격과 무게 표기 (같은 종류의 가격과 무게는 동일)
		// 과자 10봉지 구매예정
		// 구매금액 오천원이상이면 500원 깎아주는 쿠폰 증정(미만이면 사용불가, 중복적용 불가)
		// 가성비 = 과자 10봉무게 / 쿠폰사용 고려시 10봉 사는데 필요한 돈

		int[] s = {sc.nextInt(), sc.nextInt()};
		int[] n = {sc.nextInt(), sc.nextInt()};
		int[] u = {sc.nextInt(), sc.nextInt()};

		double sRate = (s[0] * 10 >= 5000) ? (s[1] * 10) / (double)(s[0] * 10 - 500) : (s[1] * 10) / (double)(s[0] * 10);
		double nRate = (n[0] * 10 >= 5000) ? (n[1] * 10) / (double)(n[0] * 10 - 500) : (n[1] * 10) / (double)(n[0] * 10);
		double uRate = (u[0] * 10 >= 5000) ? (u[1] * 10) / (double)(u[0] * 10 - 500) : (u[1] * 10) / (double)(u[0] * 10);

		double maxRate = Math.max(sRate, nRate);
		maxRate = Math.max(maxRate, uRate);

		if(maxRate == sRate) System.out.println("S");
		else if(maxRate == nRate) System.out.println("N");
		else System.out.println("U");
		sc.close();
    }
}