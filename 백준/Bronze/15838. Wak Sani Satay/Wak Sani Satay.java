import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int num = 1;

		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;

			double result = 0.0;

			for(int i = 0; i < n; i++) {
				// 고기 판매량
				int chicken = sc.nextInt();
				int beef = sc.nextInt();
				int lamb = sc.nextInt();

				// nasi impit 개수
				int ni = sc.nextInt();

				// 총수익 계산 = 고기 판매량 * 꼬치당 사테 가격
				double chickenIC = 0.80 * chicken;
				double beefIC = 1.00 * beef;
				double lambIC = 1.20 * lamb;
				double niIC = 0.80 * ni;
				double income = chickenIC + beefIC + lambIC + niIC;

				// 총비용 계산 
				// = 꼬치n개를 만들기 위해 필요한 고기 kg (n / 85(1kg 당 사태양)) * (1kg 당 고기 가격 + 1kg 당 향신료 금액(8.00))
				double chickenTC = ((double) chicken / 85) * (7.50 + 8.00);
                double beefTC = ((double) beef / 85) * (24.00 + 8.00);
                double lambTC = ((double) lamb / 85) * (32.00 + 8.00);
                double niTC = ni * 0.20;

				double totalCost = chickenTC + beefTC + lambTC + niTC;

				// 순이익 계산 = 총수익 - 총비용
				double netProfit = income - totalCost;
				
				result += netProfit;
			}
			
			System.out.printf("Case #%d: RM%.2f\n", num, result);
			num++;
		}
        sc.close();
    }
}
