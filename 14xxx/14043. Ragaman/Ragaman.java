import java.util.Scanner;

public class Main {
    public static String solve(String a, String b) {
        int[] aInfo = new int[26];
        int[] bInfo = new int[26];
        int star = 0;

        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            aInfo[c - 'a']++;
        }

        for(int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);

            if(c == '*') star++;
            else bInfo[c-'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(aInfo[i] > bInfo[i]) {
                star -= (aInfo[i]- bInfo[i]);
                if(star < 0) return "N";
            }
            else if(aInfo[i] < bInfo[i]) return "N";
        }

        return "A";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(solve(a, b));
        sc.close();
    }
}