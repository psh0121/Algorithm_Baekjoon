import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ab = {sc.nextInt(), sc.nextInt()};
        int[] cd = {sc.nextInt(), sc.nextInt()};

        Arrays.sort(ab);
        Arrays.sort(cd);

        int a, b, c, d;

        if(ab[0] < cd[0]) {
            a = ab[0];
            b = ab[1];
            c = cd[0];
            d = cd[1];
        }
        else {
            a = cd[0];
            b = cd[1];
            c = ab[0];
            d = ab[1];
        }

        int cnt = 0;
        
        if(b < c) {
            cnt = (b-a+1) + (d-c+1);
        }
        else if(b > c && a < c && b < d) {
            cnt = d - a + 1;
        }
        else if(a <= c && c < b && a <= d) {
            cnt = b - a + 1;
        }
        else if(b == c) {
            cnt = d - a + 1;
        }

        System.out.println(cnt);
        sc.close();
    }
}