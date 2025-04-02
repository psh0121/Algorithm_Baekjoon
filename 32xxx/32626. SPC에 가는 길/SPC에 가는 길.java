import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt(), sy = sc.nextInt();   // 승형
        int ex = sc.nextInt(), ey = sc.nextInt();   // 대회장
        int px = sc.nextInt(), py = sc.nextInt();   // 근수

        if (sx == ex) {
            // x축이 같으면 y값에 따라 직진이 가능한지 확인
            if ((sx == px && sy < py && py < ey) || (sx == px && ey < py && py < sy)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        } else if (sy == ey) {
            // y축이 같으면 x값에 따라 직진이 가능한지 확인
            if ((sy == py && sx < px && px < ex) || (sy == py && ex < px && px < sx)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        } else {
            // x, y축이 모두 다르면 1번
            System.out.println(1);
        }
        sc.close();
    }
}
