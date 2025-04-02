import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   // 한명 근로시 소요일
        int p = sc.nextInt();   // 하루 할때마다 지급되는 페이
        int x = sc.nextInt();   // 페인트 고용시마다 내야하는 최소금액

        double result = 0.0;

        // 한명이 한다면?
        double person = (double)x + ((double)k * p);

        // 다수라면?
        // while을 사용해서 person으로 했을시보다 작은 값이 유지될떄까지 돌려가며 값을 적용한다
        double people = (double)x + ((double)k * p);
        int m = 1;    // 사람수

        while (true) {
            m++;
            double temp = (double)x * m + ((double)k / m * p);

            people = Math.min(people, temp);

            if(temp > person) break;
        }


        result = Math.min(person, people);

        System.out.printf("%.3f", result);
        sc.close();
    }
}
