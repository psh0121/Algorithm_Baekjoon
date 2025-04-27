import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == 0 && m == 0) break;

            int[] taro = new int[n];
            int[] hanako = new int[m];
            int taroSum = 0;
            int hanakoSum = 0;

            for(int i = 0; i < n; i++) {
                int num = sc.nextInt();
                taro[i] = num;
                taroSum += num;
            }

            for(int i = 0; i < m; i++) {
                int num = sc.nextInt();
                hanako[i] = num;
                hanakoSum += num;
            }

            int taroCard = 0;
            int hanakoCard = 0;
            int cardSum = Integer.MAX_VALUE;
            boolean isChange = false;

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    int taroTemp = taroSum - taro[i] + hanako[j];
                    int hanakoTemp = hanakoSum - hanako[j] + taro[i];

                    if(taroTemp == hanakoTemp) {
                        if(taro[i] + hanako[j] < cardSum) {
                            taroCard = taro[i];
                            hanakoCard = hanako[j];

                            cardSum = taroCard + hanakoCard;

                            isChange = true;
                        }
                    }
                }
            }

            if(isChange) System.out.println(taroCard + " " + hanakoCard);
            else System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
