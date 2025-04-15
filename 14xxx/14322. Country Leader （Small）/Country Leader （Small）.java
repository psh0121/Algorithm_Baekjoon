import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            int maxAlphabetCnt = 0;

            for(int j = 0; j < n; j++) {
                String realName = sc.nextLine();
                String name = realName.replaceAll(" ", "");
                Set<Character> alphabet = new HashSet<>();

                for(int k = 0; k < name.length(); k++) {
                    alphabet.add(name.charAt(k));
                }

                if(alphabet.size() > maxAlphabetCnt) {
                    list = new ArrayList<>();
                    list.add(realName);
                    maxAlphabetCnt = alphabet.size();
                }
                else if(alphabet.size() == maxAlphabetCnt) {
                    list.add(realName);
                }
            }

            Collections.sort(list);
            System.out.println("Case #" + i + ": " + list.get(0));
        }
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
