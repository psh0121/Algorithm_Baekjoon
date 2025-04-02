import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int s = sc.nextInt();

        int nWalkCnt = (a + b) * (s / (a + b)); // Nikky 현재 걸음
        int nCurLocation = (a - b) * (s / (a + b)); // Nikky 현재 위치
        int nRemainWalkCnt = s - nWalkCnt;  // Nikky 남은 걸음

        if(nRemainWalkCnt <= a) nCurLocation += nRemainWalkCnt;
        else {
            nCurLocation += a;
            nRemainWalkCnt -= a;
            nCurLocation -= nRemainWalkCnt;
        }

        int bWalkCnt = (c + d) * (s / (c + d)); // Byron 현재 걸음
        int bCurLocation = (c - d) * (s / (c + d)); // Byron 현재 위치
        int bRemainWalkCnt = s - bWalkCnt;  // Byron 남은 걸음

        if(bRemainWalkCnt <= c) bCurLocation += bRemainWalkCnt;
        else {
            bCurLocation += c;
            bRemainWalkCnt -= c;
            bCurLocation -= bRemainWalkCnt;
        }

        if(Math.abs(nCurLocation) > Math.abs(bCurLocation)) System.out.println("Nikky");
        else if(Math.abs(nCurLocation) == Math.abs(bCurLocation)) System.out.println("Tied");
        else System.out.println("Byron");

        sc.close();
    }
}