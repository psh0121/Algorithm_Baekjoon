import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = 1;

        while (true) {
            int p = sc.nextInt();
            int e = sc.nextInt();
            int i = sc.nextInt();
            int d = sc.nextInt();

            if(p == -1 && e == -1 && i == -1 && d == -1) break;

            // 신체주기
            // 감정주기와 일치할때 까지 23을 더해준다.
            // (x - e)을 감정주기(28)로 나누어 떨어져야 감정주기까지 맞춘거라 할 수 있다
            int x = p;
            while ((x - e) % 28 != 0) {
                x += 23;
            }

            // 감정주기
            // 신체주기와 감정주기가 동시에 맞을때까지 23*28을 더해준다.
            while ((x - i) % 33 != 0) {
                x += 23 * 28;
            }

            // 지식주기
            // d이후 첫번째 트리플 피크를 찾기 위해 23*28*33을 더해준다
            while (x <= d) {
                x += 23 * 28 * 33;
            }

            System.out.printf("Case %d: the next triple peak occurs in %d days.\n", t++, x-d);
        }
        
        sc.close();
    }
}