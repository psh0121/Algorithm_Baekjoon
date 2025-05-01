import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] space = new String[n];
            for(int i = 0; i < n; i++) space[i] = sc.next();

            ArrayList<Integer> planetY = new ArrayList<>();
            ArrayList<Integer> planetX = new ArrayList<>();

            int curY = 0;
            int curX = 0;

            // 행성들 좌표찍기
            for(int i = 0; i < n; i++) {
                String temp = space[i];

                for(int j = 0; j < n; j++) {
                    char value = temp.charAt(j);

                    if(value == 'p') {
                        planetY.add(i);
                        planetX.add(j);
                    }
                    else if(value == 's') {
                        curY = i;
                        curX = j;
                    }
                }
            }

            // 가장 거리가 짧은 행성의 위치 알아내기
            int minY = 0;
            int minX = 0;
            Double minDistance = Double.MAX_VALUE;

            for(int i = 0; i < planetX.size(); i++) {
                double distance = Math.sqrt((planetY.get(i) - curY) * (planetY.get(i) - curY) + 
                (planetX.get(i) - curX) * (planetX.get(i) - curX));

                if(distance < minDistance) {
                    minY = planetY.get(i);
                    minX = planetX.get(i);

                    minDistance = distance;
                }
            }

            System.out.printf("(%d,%d):(%d,%d):%.2f\n", curY, curX, minY, minX, minDistance);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
