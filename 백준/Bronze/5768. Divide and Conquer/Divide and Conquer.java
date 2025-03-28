import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    // number의 약수의 개수
    public static int getDivisor(int num) {
        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= num; i++) {
            if(set.contains(i)) break;

            if(num % i == 0) {
                set.add(i);
                set.add(num / i);
            }
        }
        
        return set.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m == 0 && n == 0) break;
            
            int x = 0;
            int y = 0;

            for(int i = m; i <= n; i++) {
                int divisorCnt = getDivisor(i);

                if(divisorCnt >= y) {
                    x = i;
                    y = divisorCnt;
                }
            }

            System.out.printf("%d %d\n", x, y);
        }

        sc.close();
    }
}