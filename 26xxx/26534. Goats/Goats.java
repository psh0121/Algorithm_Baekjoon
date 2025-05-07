import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int[] play1 = new int[6];
        int[] play2 = new int[6];

        for(int i = 0; i < 6; i++) play1[i] = sc.nextInt();
        for(int i = 0; i < 6; i++) play2[i] = sc.nextInt();

        int win = 0;
        int lose = 0;

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(play1[i] > play2[j]) win++;
                else if(play1[i] < play2[j]) lose++;
            }
        }

        System.out.printf("%.5f", (double)win / (win + lose));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

