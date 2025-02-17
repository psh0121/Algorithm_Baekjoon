import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // 이동 시간
        int p = sc.nextInt();   // 배터리 잔량

        double result = 0;

        if (p >= 20) {
            double minuteP = (100 - p) / (double)t;
            result = ((p - 20) / minuteP) + (20 / (minuteP / 2));
        }

        else {
            double minuteP = ((100 - 20) + (20 - p) * 2) / (double)t;
            result = p / (minuteP / 2);
        }

        System.out.println(result);
        sc.close();
    }
}
