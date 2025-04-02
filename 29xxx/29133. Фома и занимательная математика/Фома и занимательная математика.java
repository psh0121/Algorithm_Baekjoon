import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int cnt = 0;
        int value = 0;

        for(int i = 1; i <= 3; i++) {
            int cal = (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
            if(cal == d) {
                cnt++;
                value = i;
            }
        }

        if(cnt > 1 || cnt == 0) System.out.println(-1);
        else System.out.println(value);

        sc.close();
    }
}