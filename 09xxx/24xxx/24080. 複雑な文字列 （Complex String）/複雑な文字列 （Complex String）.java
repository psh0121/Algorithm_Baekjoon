import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set.size() >= 3 ? "Yes" : "No");
        sc.close();
    }
}