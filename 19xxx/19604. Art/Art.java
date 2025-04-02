import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int minX = 100;
        int maxX = -1;
        int minY = 100;
        int maxY = -1;

        for(int i = 0; i < n; i++) {
            String[] temp = sc.next().split(",");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        System.out.println((minX-1) + "," + (minY-1));
        System.out.println((maxX+1) + "," + (maxY+1));
        sc.close();
    }
}