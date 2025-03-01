import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minX = -1000000000;
        int maxX = 1000000000;
        int minY = -1000000000;
        int maxY = 1000000000;

        boolean isL = false;
        boolean isR = false;
        boolean isU = false;
        boolean isD = false;

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char type = sc.next().charAt(0);

            if(type == 'L') {
                maxX = Math.min(maxX, x);
                isL = true;
            }
            else if(type == 'R') {
                minX = Math.max(minX, x);
                isR = true;
            }
            else if(type == 'U') {
                minY = Math.max(minY, y);
                isU = true;
            }
            else if(type == 'D') {
                maxY = Math.min(maxY, y);
                isD = true;
            }
        }

        // 조건이 성립되지 않으면 Infinity
        if(
            minX > maxX || minY > maxY ||
            !isL || !isR || !isU || !isD
        ) {
            System.out.println("Infinity");
        }
        else {
            int cntX = minX < 0 && maxX > 0 ? maxX - minX - 1 : Math.abs(maxX - minX) -1;
            int cntY = minY < 0 && maxY > 0 ? maxY - minY - 1 : Math.abs(maxY - minY) -1;

            long result = (long) cntX * cntY;
            System.out.println(result);
        }
        sc.close();
    }
}
