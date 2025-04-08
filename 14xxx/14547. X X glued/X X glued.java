import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static String solve(String num) {
        Set<Character> set = new TreeSet<>();

        for(int i = 0; i < num.length() - 1; i++) {
            if(num.charAt(i) == num.charAt(i+1)) {
                set.add(num.charAt(i));
            }
        }

        String result = "";

        if(set.size() == 0) return result;

        List<Character> list = new ArrayList<>(set);

        for(int i = 0; i < list.size(); i++) {
            char value = list.get(i);

            if(i == list.size() - 1) {
                result += value + " " + value + " glued";
            }
            else {
                result += value + " " + value + " glued and ";
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String a = sc.next();
            if(a.equals("#")) break;
            String num = sc.next();
            String b = sc.next();

            String result = solve(num);

            if(result.length() == 0) continue;

            System.out.println(solve(num));
        }
        sc.close();
    }
}
