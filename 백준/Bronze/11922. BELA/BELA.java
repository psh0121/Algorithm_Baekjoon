import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 4;
        String b = sc.next();

        Map<Character, Integer> goodMap = new HashMap<>();
        goodMap.put('A', 11);
        goodMap.put('K', 4);
        goodMap.put('Q', 3);
        goodMap.put('J', 20);
        goodMap.put('T', 10);
        goodMap.put('9', 14);
        goodMap.put('8', 0);
        goodMap.put('7', 0);

        Map<Character, Integer> badMap = new HashMap<>();
        badMap.put('A', 11);
        badMap.put('K', 4);
        badMap.put('Q', 3);
        badMap.put('J', 2);
        badMap.put('T', 10);
        badMap.put('9', 0);
        badMap.put('8', 0);
        badMap.put('7', 0);

        int sum = 0;

        for(int i = 0; i < n; i++) {
            String card = sc.next();

            if(card.contains(b)) {
                sum += goodMap.get(card.charAt(0));
            }
            else {
                sum += badMap.get(card.charAt(0));
            }
        }

        System.out.println(sum);
        sc.close();
    }
}