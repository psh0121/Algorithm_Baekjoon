import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int distance = y - x;   // 두 토끼사이의 거리
            int speed = a + b;  // 두 토끼의 속도 합

            if(distance % speed == 0) {
                System.out.println(distance / speed);
            }
            // 딱 떨어지지 않는다는건 이미 지나쳐서 만날수 없다는 것
            else System.out.println(-1);
        }
        sc.close();
    }
}