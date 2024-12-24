import java.util.Scanner;

public class Main {
  public static int correctCnt(int[] board, int[][] game) {
    int result = 0;

    for(int i = 0; i < game.length; i++) {
      int v1 = game[i][0];
      int v2 = game[i][1];
      int guessNum = game[i][2];

      int temp1 = board[v1];
      int temp2 = board[v2];

      board[v1] = temp2;
      board[v2] = temp1;

      if(board[guessNum] == 1) result++;
    }
    return result;
  }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] game = new int[n][3];
    for(int i = 0; i < n; i++) {
      game[i][0] = sc.nextInt();  // 변경위치
      game[i][1] = sc.nextInt();  // 변경위치
      game[i][2] = sc.nextInt();  // 예측
    }

    int a = correctCnt(new int[]{0, 1, 0, 0}, game);
    int b = correctCnt(new int[]{0, 0, 1, 0}, game);
    int c = correctCnt(new int[]{0, 0, 0, 1}, game);

    System.out.println(Math.max(a, Math.max(b, c)));
		sc.close();
    }
}
