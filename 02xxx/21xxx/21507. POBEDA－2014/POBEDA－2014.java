import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        // (a, b), (c, d)는 짝꿍이다.
        // 각자 만들수 있는 사각형의 개수를 구한다.
        long ab = Math.min(a, b);
        long cd = Math.min(c, d);

        // 총합계를 구하고 제곱근을 구하여 만들수 있는 정사각형 한변길이를 구한다.
        long sum = ab + cd;
        long value = (long)Math.sqrt(sum);

        // value의 값을 늘리고 줄여가면서 sum의 값과 근접해가도록 하여 값을 알아낸다.
        while (value * value < sum) {
            value++;
        }

        while (value * value > sum) {
            value--;
        }

        System.out.println(value);
        sc.close();
    }
}