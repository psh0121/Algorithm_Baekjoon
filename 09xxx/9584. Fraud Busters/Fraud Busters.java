import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String findBoard = sc.next();
        int n = sc.nextInt();

        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
          String board = sc.next();
          boolean isSame = true;

          for(int j = 0; j < 9; j++) {
            if(findBoard.charAt(j) != '*') {
              if(findBoard.charAt(j) != board.charAt(j)) {
                isSame = false;
                break;
              }
            }
          }

          if(isSame) {
            sb.append(board).append("\n");
            cnt++;
          }
        }

        System.out.println(cnt);
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
