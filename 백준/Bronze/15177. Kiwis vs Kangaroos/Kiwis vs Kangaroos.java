import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        Map<Character, Integer> kangaroo = new HashMap<>();
        kangaroo.put('K', 1);
        kangaroo.put('A', 2);
        kangaroo.put('N', 1);
        kangaroo.put('G', 1);
        kangaroo.put('R', 1);
        kangaroo.put('O', 2);
        Map<Character, Integer> kiwibird = new HashMap<>();
        kiwibird.put('K', 1);
        kiwibird.put('I', 3);
        kiwibird.put('W', 1);
        kiwibird.put('B', 1);
        kiwibird.put('R', 1);
        kiwibird.put('D', 1);

        int kang = 0;
        int kiwi = 0;

        String str = sc.next().toUpperCase();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(kangaroo.containsKey(c)) kang += kangaroo.get(c);
            if(kiwibird.containsKey(c)) kiwi += kiwibird.get(c);
        }

        if(kang > kiwi) System.out.println("Kangaroos");
        else if(kang == kiwi) System.out.println("Feud continues");
        else System.out.println("Kiwis");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}