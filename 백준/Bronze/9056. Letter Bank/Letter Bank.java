import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();

            String str1 = sc.next();
            String str2 = sc.next();

            for(int j = 0; j < str1.length(); j++) {
                set1.add(str1.charAt(j));
            }

            for(int j = 0; j < str2.length(); j++) {
                set2.add(str2.charAt(j));
            }

            if(set1.size() == set2.size()) {
                boolean isSame = true;

                for(Character value : set1) {
                    if(!set2.contains(value)) {
                        isSame = false;
                        break;
                    }
                }

                if(isSame)System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");

        }
        sc.close();
    }
}
