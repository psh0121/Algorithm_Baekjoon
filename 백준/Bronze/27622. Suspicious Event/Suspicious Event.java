import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static int solve (Scanner sc) {
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int result = 0;

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if(value < 0) {
                if(!set.contains(Math.abs(value))) {
                    result ++;
                }
                else set.remove(Math.abs(value));
            }
            else set.add(value);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc));
        sc.close();
    }
}