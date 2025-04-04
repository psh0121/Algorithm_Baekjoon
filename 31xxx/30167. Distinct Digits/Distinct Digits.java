import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static boolean solve(int num) {
        String strNum = Integer.toString(num);
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < strNum.length(); i++) {
            set.add(strNum.charAt(i));
        }

        return set.size() == strNum.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        for(int i = l; i <= r; i++) {
            if(solve(i)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
        sc.close();
    }
}