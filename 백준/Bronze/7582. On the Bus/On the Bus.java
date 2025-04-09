import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String bus = sc.next();
            int maxNum = sc.nextInt();
            if(bus.equals("#") && maxNum == 0) break;

            int cur = sc.nextInt();
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {
                int out = sc.nextInt();
                int in = sc.nextInt();

                cur = cur - out < 0 ? 0 : cur - out;
                cur = cur + in > maxNum ? maxNum : cur + in;
            }

            System.out.println(bus + " " + cur);
        }

        sc.close();
    }
}