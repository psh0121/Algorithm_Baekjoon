import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long walk = sc.nextLong();
        long sleep = sc.nextLong();
        long study = 8;

        // 집 = 공부시간(n) + 수면시간((n-1)/8 * sleep)
        // 수면시간에서 n-1은 다하고 자버릴수도 있기 때문에 -1을 한다
        long zip = n + ((n-1) / study) * sleep;

        // 독서실 = 독서실가기 + 공부시간 + 왔다갔다시간 + 수면시간
        long dok = walk + m + ((m-1) / study) * (sleep + (2 * walk));

        if(zip < dok) {
            System.out.println("Zip");
            System.out.println(zip);
        }
        else {
            System.out.println("Dok");
            System.out.println(dok);
        }
        sc.close();
    }
}
