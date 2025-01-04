import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
          int player1 = 0;
          int player2 = 0;

          for(int j = 0; j < 3; j++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double distance = Math.sqrt((x * x) + (y * y));

            if(distance <= 3) player1 += 100;
            else if(distance <= 6) player1 += 80;
            else if(distance <= 9) player1 += 60;
            else if(distance <= 12) player1 += 40;
            else if(distance <= 15) player1 += 20;
          }

          for(int j = 0; j < 3; j++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double distance = Math.sqrt((x * x) + (y * y));

            if(distance <= 3) player2 += 100;
            else if(distance <= 6) player2 += 80;
            else if(distance <= 9) player2 += 60;
            else if(distance <= 12) player2 += 40;
            else if(distance <= 15) player2 += 20;
          }

          if(player1 > player2) {
            System.out.printf("SCORE: %d to %d, PLAYER 1 WINS.\n", player1, player2);
          }
          else if(player1 == player2) {
            System.out.printf("SCORE: %d to %d, TIE.\n", player1, player2);
          }
          else {
            System.out.printf("SCORE: %d to %d, PLAYER 2 WINS.\n", player1, player2);
          }
        }
        sc.close();
    }
}
