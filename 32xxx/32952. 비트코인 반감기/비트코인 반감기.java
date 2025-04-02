import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long R = sc.nextLong();
        long K = sc.nextLong();
        long M = sc.nextLong();

        long i = 0;

        while (i <= M) {
            if(i == M || M - i < K) break;
            if(R == 0) break;
            
            i += K;
            R /= 2;
        }

        System.out.println(R);
        sc.close();
    }
}
