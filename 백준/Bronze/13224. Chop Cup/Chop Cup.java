import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ball = {1, 0, 0};
        String board = sc.next();

        for(int i = 0; i < board.length(); i++) {
          char letter = board.charAt(i);
          int temp = 0;

          if(letter == 'A') {
            temp = ball[0];
            ball[0] = ball[1];
            ball[1] = temp;
          }
          else if(letter == 'B') {
            temp = ball[1];
            ball[1] = ball[2];
            ball[2] = temp;
          }
          else {
            temp = ball[0];
            ball[0] = ball[2];
            ball[2] = temp;
          }
        }

        if(ball[0] == 1) System.out.println(1);
        else if(ball[1] == 1) System.out.println(2);
        else System.out.println(3);
        sc.close();
    }
}