import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // BigInteger로 입력 값을 읽음
        BigInteger[] arr = new BigInteger[3];
        arr[0] = sc.nextBigInteger();
        arr[1] = sc.nextBigInteger();
        arr[2] = sc.nextBigInteger();
        
        // BigInteger 배열을 정렬
        Arrays.sort(arr, (x, y) -> x.compareTo(y));

        BigInteger a = arr[2];
        BigInteger b = arr[1];
        BigInteger c = arr[0];

        // 조건에 따른 결과 계산
        BigInteger result;
        if (b.equals(BigInteger.ZERO)) {
            result = a;
        } else {
            result = a.multiply(b).add(c);
        }

        // 결과 출력
        System.out.println(result);
        sc.close();
    }
}
