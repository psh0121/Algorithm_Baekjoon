import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);

        while (true) {
            String value = sc.next();
            if(value.equals("#")) break;

            boolean isOK = true;

            char before = value.charAt(0);

            for(int i = 1; i < value.length(); i++) {
                char cur = value.charAt(i);
                int diff = map.get(cur) - map.get(before);

                if(map.get(before) > map.get(cur)) {
                    diff = 7 - map.get(before) + map.get(cur);
                }

                if(diff == 0 || diff > 6 || diff % 2 != 0) {
                    isOK = false;
                    break;
                }

                before = cur;
            }

            System.out.println(isOK ? "That music is beautiful." : "Ouch! That hurts my ears.");
        }
        sc.close();
    }
}