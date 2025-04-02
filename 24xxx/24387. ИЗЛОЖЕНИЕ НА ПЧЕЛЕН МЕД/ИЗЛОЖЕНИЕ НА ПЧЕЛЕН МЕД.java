import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 가격과 꿀 양을 BigInteger 배열로 변경
        BigInteger[] price = {
            sc.nextBigInteger(), 
            sc.nextBigInteger(), 
            sc.nextBigInteger()
        };
        BigInteger[] honey = {
            sc.nextBigInteger(), 
            sc.nextBigInteger(), 
            sc.nextBigInteger()
        };

        // 배열 정렬
        Arrays.sort(price);
        Arrays.sort(honey);

        // 최대 가격을 BigInteger로 초기화
        BigInteger maxPrice = BigInteger.ZERO;

        // 최대 가격 계산
        for (int i = 0; i < 3; i++) {
            maxPrice = maxPrice.add(price[i].multiply(honey[i]));
        }

        // 결과 출력
        System.out.println(maxPrice);
        sc.close();
    }
}
