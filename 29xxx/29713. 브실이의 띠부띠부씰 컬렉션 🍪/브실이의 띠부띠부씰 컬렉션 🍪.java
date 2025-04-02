import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('B', 0);
        map.put('R', 0);
        map.put('O', 0);
        map.put('N', 0);
        map.put('Z', 0);
        map.put('E', 0);
        map.put('S', 0);
        map.put('I', 0);
        map.put('L', 0);
        map.put('V', 0);

        int n = sc.nextInt();
        String s = sc.next();

        for(int i = 0; i < n; i++) {
            Character key = s.charAt(i);

            if("BRONZESILVER".contains(Character.toString(key))) {
                map.put(key, map.get(key) + 1);
            }
        }

        map.put('E', map.get('E') / 2);
        map.put('R', map.get('R') / 2);

        int result = Integer.MAX_VALUE;

        for(Character key : map.keySet()) {
            result = Math.min(result, map.get(key));
        }

        System.out.println(result);
        sc.close();
        
    }
}