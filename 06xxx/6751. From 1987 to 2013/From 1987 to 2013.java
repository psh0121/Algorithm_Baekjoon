import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt() + 1;

        while (true) {
           String yearStr = Integer.toString(year);
           HashSet<Character> set = new HashSet<>();

           for(char c : yearStr.toCharArray()) {
            set.add(c);
           }

           if(yearStr.length() == set.size()) {
            break;
           }

           year++;
        }

        System.out.println(year);
        sc.close();
    }
}
