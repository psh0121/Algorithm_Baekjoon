import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] arr = new Double[10];
        for(int i = 0; i < 10; i++) arr[i] = sc.nextDouble();

        // 내림차순
        Arrays.sort(arr, Collections.reverseOrder());

        double[] rateArr = new double[9];

        for(int i = 0; i < 9; i++) {
            rateArr[i] = arr[i] / (i+1);
        }

        double result = 1;

        for(int i = 0; i < 9; i++) {
            result *= rateArr[i];
        }

        System.out.println(result * 1000000000);
        sc.close();
    }
}
