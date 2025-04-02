import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] t2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(t1);
        Arrays.sort(t2);

        if(
            (t1[0]*t1[0] + t1[1]*t1[1] == t1[2]*t1[2]) &&
            (t2[0]*t2[0] + t2[1]*t2[1] == t2[2]*t2[2]) &&
            (t1[0] == t2[0] && t1[1] == t2[1] && t1[2] == t2[2])
        ) System.out.println("YES");

        else System.out.println("NO");

        sc.close();
    }
}
