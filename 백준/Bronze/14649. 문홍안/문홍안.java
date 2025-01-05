import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int[] stone = new int[101]; // 0:B, 1:R, 2:G
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
          int position = sc.nextInt();  // 비서 시작위치
          char direction = sc.next().charAt(0); // 이동 방향

          if(direction == 'R') {
            for(int j = position+1; j <= 100; j++) {
              stone[j] = (stone[j] + 1) % 3;
            }
          }
          else {
            for(int j = 1; j <= position - 1; j++) {
              stone[j] = (stone[j] + 1) % 3;
            }
          }
        }

        // 색깔별 돌 개수 계산
        int bCnt = 0;
        int rCnt = 0;
        int gCnt = 0;
        for(int i = 1; i <= 100; i++) {
          if(stone[i] == 0) bCnt++;
          else if(stone[i] == 1) rCnt++;
          else gCnt++;
        }

        System.out.printf("%.2f\n%.2f\n%.2f",
          p * ((double) bCnt / 100),
          p * ((double) rCnt / 100),
          p * ((double) gCnt / 100)
        );
        sc.close();
    }
}