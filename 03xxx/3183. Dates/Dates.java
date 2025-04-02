import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);

        while (true) {
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();

            if(d == 0 && m == 0 && y == 0) break;

            if(m == 2) {
                if(
                    (y % 4 == 0 && y % 100 != 0) ||
                    (y % 400 == 0)
                ) {
                    if(d <= 29) System.out.println("Valid");
                    else System.out.println("Invalid");
                }
                else {
                    if(d <= 28) System.out.println("Valid");
                    else System.out.println("Invalid");
                }
            }
            else if(m <= 12 && m >= 1) {
                if(d <= map.get(m) && d >= 1) System.out.println("Valid");
                else System.out.println("Invalid");
            }
            else System.out.println("Invalid");

        }
        sc.close();
    }
}
