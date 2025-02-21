import java.util.Scanner;

public class Main {
    public static long getDistance(long a, long b, long c, long d) {
        return Math.abs(a - c) + Math.abs(b - d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sx = sc.nextLong(); 
        long sy = sc.nextLong(); 
        long ex = sc.nextLong(); 
        long ey = sc.nextLong(); 

        long minDistance = Long.MAX_VALUE; 
        int num = 0;

        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long distance = 0; 

            long a = sx; 
            long b = sy; 

            for(int j = 0; j < m; j++) {
                long c = sc.nextLong(); 
                long d = sc.nextLong(); 

                distance += getDistance(a, b, c, d); // 거리 계산

                a = c; 
                b = d;
            }

            distance += getDistance(a, b, ex, ey); 

            // 최소 거리 갱신
            if(distance < minDistance){
                minDistance = distance;
                num = i + 1; // 내비게이션 번호
            }
        }

        System.out.println(num); 
        sc.close();
    }
}
