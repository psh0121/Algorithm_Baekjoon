import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        while (true) {
            int day = sc.nextInt();
            String monthStr = sc.next();
            if(day == 0 && monthStr.equals("#")) break;

            int month = map.get(monthStr);

            if(month == 8 && day == 4) System.out.println("Happy birthday");
            else if(month == 2 && day == 29) System.out.println("Unlucky");
            else if((month == 8 && day < 4) || month < 8) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}