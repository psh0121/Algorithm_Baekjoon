import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            if(A == 0 && B == 0 && C == 0 && D == 0) break;

            // 이미지의 짧은 변과 긴변 설정
            int imgShort = Math.min(A, B);
            int imgLong = Math.max(A, B);

            // 종이의 짧은 변과 긴변 설정
            int paperShort = Math.min(C, D);
            int paperLong = Math.max(C, D);
            int percentage = 100;

            while (true) {
                double calShort = (double)imgShort * percentage / 100;
                double calLong = (double)imgLong * percentage / 100;

                if(calShort <= (double)paperShort && calLong <= (double)paperLong) break;
                percentage--;
            }

            System.out.println(percentage + "%");

        }
        sc.close();
    }
}
