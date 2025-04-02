import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal d = sc.nextBigDecimal();
        BigDecimal h = sc.nextBigDecimal();

        BigDecimal PI = new BigDecimal(Math.PI);

        // 지름
        BigDecimal totalD = d.add(BigDecimal.TEN);
        // 반지름
        BigDecimal totalR = totalD.divide(BigDecimal.valueOf(2));

        // 측면 면적
        BigDecimal sideArea = PI.multiply(totalD).multiply(h);
        // 윗면 면적
        BigDecimal topArea = PI.multiply(totalR.pow(2));

        BigDecimal totalArea = sideArea.add(topArea);

        System.out.println(totalArea);
        sc.close();
    }
}