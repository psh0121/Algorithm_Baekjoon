import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String aeiouy = "aeiouy";

        while (true) {
            String word = sc.next();
            if(word.equals("quit!")) break;
            
            if(word.length() <= 4) {
                System.out.println(word);
                continue;
            }
            
            String lastTwo = word.substring(word.length() - 2);
            String c = Character.toString(word.charAt(word.length()-3));

            if(!aeiouy.contains(c) && lastTwo.equals("or")) {
                System.out.println(word.substring(0, word.length() - 2) + "our");
            }
            else System.out.println(word);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

