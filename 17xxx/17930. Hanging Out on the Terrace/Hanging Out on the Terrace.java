import java.util.Scanner;

public class Main {
    public static int solve(Scanner sc) {
        int l = sc.nextInt();
        int n = sc.nextInt();
        int cur = 0;
        int result = 0;

        while (n-- > 0) {
            String order = sc.next();
            int cnt = sc.nextInt();

            if(order.equals("enter")) {
                if(cur + cnt > l) result++;
                else {
                    cur += cnt;
                }
            }
            else {
                cur -= cnt;
                if(cur < 0) cur = 0;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc));
    }
}
