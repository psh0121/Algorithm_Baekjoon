import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            String str = sc.next();

            Set<Character> set = new HashSet<>();

            for(int j = 0; j < str.length(); j++) {
                char letter = str.charAt(j);

                if((int)letter - 64 > m) break;

                if(set.contains(letter)) break;
                else set.add(letter);
            }

            if(set.size() != str.length()) continue;
            else cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}