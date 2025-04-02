import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            String name = sc.next();
            char lastChar = name.toLowerCase().charAt(name.length() - 1);

            if(lastChar == 'y') {
                System.out.println("Case #" + i + ": " + name + " is ruled by nobody.");
            }
            else if("aeiou".contains("" + lastChar)) {
                System.out.println("Case #" + i + ": " + name + " is ruled by a queen.");
            }
            else {
                System.out.println("Case #" + i + ": " + name + " is ruled by a king.");
            }
        }
        sc.close();
    }
}
