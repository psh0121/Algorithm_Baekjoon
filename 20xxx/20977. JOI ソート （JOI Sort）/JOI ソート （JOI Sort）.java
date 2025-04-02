import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('J', 0);
        map.put('O', 0);
        map.put('I', 0);

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            map.put(letter, map.get(letter) + 1);
        }

        System.out.println(
            "J".repeat(map.get('J')) + 
            "O".repeat(map.get('O')) + 
            "I".repeat(map.get('I'))
        );
        sc.close();
    }
}
