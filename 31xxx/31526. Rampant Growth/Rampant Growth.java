import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int r = sc.nextInt();
        int c = sc.nextInt();

        // 첫번째 열에는 r개의 행중 아무곳에나 식물을 둘 수 있기에
        // 첫 열에는 r가지의 경우의 수가 있으므로 result의 값에 r을 넣어둔다.
        long result = r;

        // 2열부터 c번째 까지 이전열과 다른 행의 식물을 두어야 하기에
        // r-1의 선택지가 존재한다
        for(int i = 1; i < c; i++) {
            result = (result * (r - 1)) % 998244353;
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
