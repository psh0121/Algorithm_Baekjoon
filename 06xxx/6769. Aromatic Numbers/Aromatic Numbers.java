import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String aromaticNum = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for(int i = 0; i < aromaticNum.length() - 1; i += 2) {
            int a = aromaticNum.charAt(i) - '0';
            char r = aromaticNum.charAt(i+1);
            int numR = map.get(r);

            int value = a * numR;

            if(i + 2 < aromaticNum.length()) {
                char nextR = aromaticNum.charAt(i+3);
                int nextNumR = map.get(nextR);

                if(numR < nextNumR) result -= value;
                else result += value;
            }
            else result += value;
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}