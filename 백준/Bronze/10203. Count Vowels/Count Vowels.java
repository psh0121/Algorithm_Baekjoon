import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String aeiou = "aeiou";

        for(int i = 0; i < n; i++) {
            int cnt = 0;
            String word = sc.next();

            for(int j = 0; j < word.length(); j++) {
                String letter = Character.toString(word.charAt(j));

                if(aeiou.contains(letter)) cnt++;
            }

            System.out.println("The number of vowels in " + word + " is " + cnt + ".");
        }
        sc.close();
    }
}