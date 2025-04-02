import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int day = sc.nextInt();
            if(day == 0) break;

            int gold = 1;
            int curDay = 0;
            int totalCnt = 0;

            for(int i = 1; i <= day; i++) {
                totalCnt += gold;
                curDay++;

                if(gold == curDay) {
                    gold++;
                    curDay = 0;
                }
            }

            System.out.println(day + " " + totalCnt);
        }
        sc.close();
    }
}