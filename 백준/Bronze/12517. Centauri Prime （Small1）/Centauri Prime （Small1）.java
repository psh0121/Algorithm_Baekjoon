import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            String name = sc.next();
            char letter = name.charAt(name.length() - 1);

            if("aeiou".contains(Character.toString(letter))) {
                System.out.println("Case #" + i + ": " + name + " is ruled by a queen.");
            }
            else if (letter == 'y') {
                System.out.println("Case #" + i + ": " + name + " is ruled by nobody.");
            }
            else System.out.println("Case #" + i + ": " + name + " is ruled by a king.");
        }
        sc.close();
    }
}
