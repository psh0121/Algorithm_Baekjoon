import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("END")) break;
            Set<Character> set = new HashSet<>();
            boolean isPass = false;

            for(int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if(letter == ' ') continue;

                if(set.contains(letter)) {
                    isPass = true;
                    break;
                }
                else {
                    set.add(letter);
                }
            }

            if(!isPass) {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
