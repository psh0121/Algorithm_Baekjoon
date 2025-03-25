import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int sMax = sc.nextInt();
            String value = sc.next();

            int curCnt = 0;
            int zeroCnt = 0;

            for(int j = 0; j < value.length(); j++) {
                int num = value.charAt(j) - '0';

                if(curCnt < j) {
                    int need = j - curCnt;
                    zeroCnt += need;
                    curCnt += need;
                }

                curCnt += num;
            }

            System.out.println("Case #" + i + ": " + zeroCnt);
        }
        sc.close();
    }
}