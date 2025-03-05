import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> colorMap = new HashMap<>();
        colorMap.put('R', 45);
        colorMap.put('G', 30);
        colorMap.put('B', 20);
        colorMap.put('Y', 15);
        colorMap.put('O', 10);
        colorMap.put('W', 5);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            double price = sc.nextDouble(); // 원래 가격
            char color = sc.next().charAt(0);   // 할인율
            char coupon = sc.next().charAt(0);  // 쿠폰 사용여부
            char pay = sc.next().charAt(0); // 결제방식

            
            double salePrice = price;

            // 색에 따라 할인률 적용하기
            // 셋째자리에서 반올림하기
            salePrice -= (price * colorMap.get(color) / 100);
            salePrice = Math.round(salePrice * 100) / 100.0;

            // 쿠폰 여부에 따라 5% 할인 
            // 셋째자리에서 반올림하기
            if(coupon == 'C') {
                salePrice -= (salePrice * 5 / 100);
                salePrice = Math.round(salePrice * 100) / 100.0;
            }

            // 결제수단이 현금일 경우 2번째 자리에서 5이하면 버리고 초과면 올린다
            if(pay == 'C') {
                int secondDecimal = (int)(salePrice * 100 % 10);

                if(secondDecimal >= 6){
                    salePrice = Math.round(salePrice);
                }
                else {
                    salePrice = (salePrice * 100 - secondDecimal) / 100.0;
                }
            }
            
            System.out.printf("$%.2f\n", salePrice);
        }
        sc.close();
    }
}
