import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int s = sc.nextInt();
        int t = sc.nextInt();

        String result = "";

        // outside
        if((s >= 1 && s <= a) && (t >= 1 && t <= a)) result = "Outside";
        else if((s >= b && s <= n) && (t >= b && t <= n)) result = "Outside";

        // city
        else if((s >= a + 1 && s <= b - 1) && (t >= a + 1 && t <= b - 1)) result = "City";
        
        // full
        else result = "Full";

        System.out.println(result);
        sc.close();
    }
}