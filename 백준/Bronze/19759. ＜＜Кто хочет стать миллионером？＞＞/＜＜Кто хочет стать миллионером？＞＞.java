import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int money = 50;

        for(int i = 0; i < n; i++) {
            money *= 2;

            // 끝의 0 개수 파악
            int zeroCnt = 0;
            String moneyStr = Integer.toString(money);

            for(int j = moneyStr.length() - 1; j >= 0; j--) {
                if(moneyStr.charAt(j) == '0') zeroCnt++;
                else break;
            }

            if(zeroCnt * 2 >= moneyStr.length()) System.out.println(moneyStr);
            else {
                String subMoneyStr = moneyStr.substring(0, moneyStr.length()/2);
                int newZeroCnt = moneyStr.length() - subMoneyStr.length();

                // 0을 붙인건 올림한거니 +1
                subMoneyStr = Integer.toString(Integer.parseInt(subMoneyStr) + 1);

                int newMoney = Integer.parseInt(subMoneyStr + "0".repeat(newZeroCnt));
                money = newMoney;

                System.out.println(money);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}