import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String plane = sc.next();
            int cnt = sc.nextInt();

            if(plane.equals("#") && cnt == 0) break;

            while (true) {
                char type = sc.next().charAt(0);
                int val = sc.nextInt();

                if(type == 'X' && val == 0) break;

                if(type == 'B') {   // 예약
                    if(cnt + val > 68) continue;
                    cnt += val;
                }
                else {  // 취소
                    if(cnt - val < 0) continue;
                    cnt -= val;
                }
            }

            System.out.println(plane + " " + cnt);
        }
        sc.close();
    }
}