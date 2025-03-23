import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[n+1];
        for(int i = 1; i < board.length; i++) {
            board[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int idx = sc.nextInt();
            int value = board[idx]+1;

            if(value == 2020) continue;

            boolean isContain = false;

            for(int j = 1; j < board.length; j++) {
                if(board[j] == value) {
                    isContain = true;
                    break;
                }
            }

            if(!isContain) {
                board[idx] = value;
            }
        }

        for(int i = 1; i < board.length; i++) {
            System.out.println(board[i]);
        }
        sc.close();
    }
}