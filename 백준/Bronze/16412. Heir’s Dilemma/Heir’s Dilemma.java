import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static boolean solve(int num) {
        // 6자리인가?
        if(Integer.toString(num).length() != 6) return false;

        // 숫자가 다 다른가?
        Set<Integer> set = new HashSet<>();
        String strNum = Integer.toString(num);

        for(int i = 0; i < strNum.length(); i++) {
            int n = strNum.charAt(i) - '0';
            set.add(n);
        }

        if(set.size() != 6) return false;

        // 각 숫자가 나누어떨어지는가?
        for(Integer s : set) {
            if(s == 0 || num % s != 0) return false;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();

        int cnt = 0;

        for(int c = l; c <= h; c++) {
            if(solve(c)) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}