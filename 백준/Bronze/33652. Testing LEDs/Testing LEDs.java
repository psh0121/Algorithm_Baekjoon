import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long value = Long.MAX_VALUE;

        while (t-- > 0) {
            long m = sc.nextLong();
            long o = sc.nextLong();

            if(o == 0) {
                value = Math.min(value, m);
            }
        }

        System.out.println(value == Long.MAX_VALUE ? -1 : value);
        sc.close();
    }
}