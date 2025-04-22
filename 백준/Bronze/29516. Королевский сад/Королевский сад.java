import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) arr[i] = sc.next();

        if(n == 1 || m == 1) {
            System.out.println("Yes");
            return;
        }

        // 행 제거
        for(int i = 0; i < n; i++) {
            String removeRow = "";

            for(int j = 0; j < n; j++) {
                if(i != j) removeRow += arr[j];
            }

            Set<Character> set = new HashSet<>();

            for(int j = 0; j < removeRow.length(); j++) {
                set.add(removeRow.charAt(j));
            }

            if(set.size() == 1) {
                System.out.println("Yes");
                return;
            }
        }

        // 열 제거
        for(int i = 0; i < m; i++) {
            String removeCol = "";

            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(i != k) removeCol += arr[j].charAt(k);
                }
            }

            Set<Character> set = new HashSet<>();

            for(int j = 0; j < removeCol.length(); j++) {
                set.add(removeCol.charAt(j));
            }

            if(set.size() == 1) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}