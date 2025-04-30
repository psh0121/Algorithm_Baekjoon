import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void solve (Scanner sc) {
       int n = sc.nextInt();
       sc.nextLine();
       String[] arr = new String[n];
       for(int i = 0; i < n; i++) arr[i] = sc.nextLine();

       Set<Character> set = new LinkedHashSet<>();

       for(int i = 0; i < n; i++) {
        String s = arr[i].replaceAll(" ", "");

        for(int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            if(!set.contains(c)) set.add(c);
        }
       }

       StringBuilder sb = new StringBuilder();

        for(char value : set) {
            sb.append(value);
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
