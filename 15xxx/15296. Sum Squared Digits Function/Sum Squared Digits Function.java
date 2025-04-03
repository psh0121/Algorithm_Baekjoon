import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            // n을 b진법으로 바꾼다
            ArrayList<Integer> list = new ArrayList<>();
            int divideN = n;

            while (divideN != 0) {
                list.add(divideN % b);
                divideN /= b;
            }

            // 각자리수의 합계구한다
            long sum = 0;
            for(Integer num : list) {
                sum += (num * num);
            }

            System.out.println(k + " " + sum);
        }
        sc.close();
    }
}