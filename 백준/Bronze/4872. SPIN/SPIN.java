import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String init = sc.next();
        int len = init.length();

        int[] num = new int[len];
        for(int i = 0; i < len; i++) num[i] = init.charAt(i) - '0';

        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) list.add(sc.next());

        for(int i = 0; i < len; i++) {
            for(String value : list) {
                num[i] += value.charAt(i) - '0';
            }
        }

        for(int i = 0; i < len; i++) num[i] %= 10;

        String result = "";

        for(int i = 0; i < len; i++) result += num[i];

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
