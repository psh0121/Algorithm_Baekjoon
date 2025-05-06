import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();

        String s = sc.next();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c - '0' >= 0 && c - '0' <= 9) numList.add(c - '0');
            else strList.add(Character.toString(c));
        }

        numList.sort(Collections.reverseOrder());
        Collections.sort(strList);

        String result = "";

        for(int i = 0; i < 3; i++) {
            result += strList.get(i);
            result += numList.get(i);
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

