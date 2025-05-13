import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int z = 1; z <= t; z++) {
            int n = sc.nextInt();   // 정거장 수
            int[] fee = new int[n]; // 정거장 수에 따른 요금표
            for(int i = 1; i < n; i++) fee[i] = sc.nextInt();

            String[] station = new String[n];   // 역 정보
            for(int i = 0; i < n; i++) station[i] = sc.next();

            String start = sc.next();   // 출발역
            String end = sc.next();     // 도착역

            int startIdx = -1;  // 출발역 위치
            int endIdx = -1;    // 도착역 위치

            for(int i = 0; i < n; i++) {    // 위치 찾기
                String temp = station[i];

                if(start.equals(temp)) startIdx = i;
                else if(end.equals(temp)) endIdx = i;
            }

            System.out.println("Data Set " + z + ":");
            System.out.println(fee[Math.abs(startIdx - endIdx)]);

            if(z != t) System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}


