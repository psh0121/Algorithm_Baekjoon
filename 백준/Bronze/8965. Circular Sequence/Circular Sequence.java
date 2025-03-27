import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            ArrayList<String> list = new ArrayList<>();
            list.add(str);

            for(int i = 1; i < str.length(); i++) {
                String newStr = str.substring(1) + str.charAt(0);
                list.add(newStr);
                str = newStr;
            }

            Collections.sort(list);

            System.out.println(list.get(0));
        }
        sc.close();
    }
}