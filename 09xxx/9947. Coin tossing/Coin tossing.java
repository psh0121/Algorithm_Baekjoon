import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String player1 = sc.next();
            String player2 = sc.next();

            if(player1.equals("#") && player2.equals("#")) break;

            int grade1 = 0;
            int grade2 = 0;

            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {
                char val1 = sc.next().charAt(0);
                char val2 = sc.next().charAt(0);

                if(val1 == val2) grade1++;
                else grade2++;
            }

            System.out.println(player1 + " " + grade1 + " " + player2 + " " + grade2);
        }
        sc.close();
    }
}
