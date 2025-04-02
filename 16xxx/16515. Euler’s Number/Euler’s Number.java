import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal sum = BigDecimal.ZERO;

        // BigDecimal.divide()는 정밀도를 설정하지 않으면 에러발생할수 있음
        // 소수점을 설정해줘야함 (20자리 계산하고, 반올림 해달라)
        BigDecimal factorial = BigDecimal.ONE;
        
        for(int i = 0; i <= n; i++) {
            if(i > 0) {
                factorial = factorial.multiply(BigDecimal.valueOf(i));
            }

            sum = sum.add(BigDecimal.ONE.divide(factorial, 20, BigDecimal.ROUND_FLOOR));
        }

        System.out.println(sum);
        sc.close();
    }
}