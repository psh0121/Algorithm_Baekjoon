import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();

            int curCnt = 0; // 현재 박수치는 관객수
            int need = 0;   // 필요한 최소 관객수
            int result = 0; // 채워야하는 관객수

            for(int j = 0; j <= n; j++) {
                if(curCnt < need) {
                    result++;
                    curCnt++;
                }

                curCnt += (s[j] - '0');
                need++;
            }

            System.out.println("Case #" + i + ": " + result);
        }
        sc.close();
    }
}