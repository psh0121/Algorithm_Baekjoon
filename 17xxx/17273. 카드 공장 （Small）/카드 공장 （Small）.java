import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cardInfo = new int[n];  // 0: 앞, 1:뒤
        int[] cardFront = new int[n];
        int[] cardBack = new int[n];

        for(int i = 0; i < n; i++) {
          cardFront[i] = sc.nextInt();
          cardBack[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
          int k = sc.nextInt();

          for(int j = 0; j < n; j++) {
            // 카드의 앞뒤여부에 따라 카드를 뒤집을지말지 설정
            int card = cardInfo[j];

            if(card == 0) { // 앞면
              if(cardFront[j] <= k) {
                cardInfo[j] = 1;
              }
            }
            else {  // 뒷면
              if(cardBack[j] <= k) {
                cardInfo[j] = 0;
              }
            }
          }
        }

        // 카드 합 계산
        long sum = 0;
        for(int i = 0; i < n; i++) {
          int card = cardInfo[i];

          if(card == 0) sum += (long)cardFront[i];
          else sum += (long)cardBack[i];
        }

        System.out.println(sum);
        sc.close();
    }
}