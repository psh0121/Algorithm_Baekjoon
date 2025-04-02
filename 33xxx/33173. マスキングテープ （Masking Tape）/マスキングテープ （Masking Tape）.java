import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr = new int[h][w];
        boolean[][] tape = new boolean[h][w];

        for(int i = 0; i < q; i++) {
            int order = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // (x, y), (x+1, y), (x, y+1), (x+1, y+1)
            int[] orderX = {x-1, x, x-1, x};
            int[] orderY = {y-1, y-1, y, y};

            if(order == 1) {
                int c = sc.nextInt();

                for(int j = 0; j < 4; j++) {
                    if(tape[orderX[j]][orderY[j]] == true) continue;
                    else arr[orderX[j]][orderY[j]] = c;
                }
            }
            else {
                for(int j = 0; j < 4; j++) {
                    if(tape[orderX[j]][orderY[j]] == true) continue;
                    else tape[orderX[j]][orderY[j]] = true;
                }
            }
        }

        for(int i = 0; i < h; i++) {
            String result = "";
            for(int j = 0; j < w; j++) {
                result += arr[i][j] + " ";
            }
            System.out.println(result.trim());
        }
        sc.close();
    }
}