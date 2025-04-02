import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
          Character letter = str.charAt(i);
          if(!list.contains(letter)) list.add(letter);
        }

        System.out.println(str.length() - list.size());
        sc.close();
    }
}