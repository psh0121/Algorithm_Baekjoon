import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        for(int i = 0; i < alphabet.length(); i++) map.put(alphabet.charAt(i), 0);

        String str = sc.nextLine().toUpperCase();

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            
            if(!alphabet.contains(Character.toString(letter))) continue;

            map.put(letter, map.get(letter) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);

            sb.append(letter + " | ")
                .append("*".repeat(map.get(letter)) + "\n");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}
