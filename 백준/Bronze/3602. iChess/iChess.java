import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int w = sc.nextInt();

        if(b == 0 && w == 0) {
            System.out.println("Impossible");
        }
        else if(b == w) {
            System.out.println((int)Math.sqrt(b+w));
        }
        else if(Math.abs(b-w) == 1) {
            System.out.println((int)Math.sqrt(b+w));
        }
        else {
            int minCnt = Math.min(w, b);
            System.out.println((int)Math.sqrt(minCnt + (minCnt + 1)));
        }
        sc.close();
    }
}
