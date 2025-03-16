import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('a', 1);
        map.put('B', 2);
        map.put('b', 1);
        map.put('D', 1);
        map.put('d', 1);
        map.put('e', 1);
        map.put('g', 1);
        map.put('O', 1);
        map.put('o', 1);
        map.put('P', 1);
        map.put('p', 1);
        map.put('Q', 1);
        map.put('q', 1);
        map.put('R', 1);
        map.put('@', 1);

        String str = sc.nextLine();
        int cnt = 0;

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(map.containsKey(letter)) {
                cnt += map.get(letter);
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}