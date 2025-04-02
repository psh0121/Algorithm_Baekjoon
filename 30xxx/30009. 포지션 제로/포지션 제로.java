import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        int minX = x - r;
        int maxX = x + r;

        int positionZero = 0;
        int position = 0;

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();

            if(minX == t || maxX == t) position++;
            else if(t > minX && t < maxX) positionZero++;
        }

        System.out.println(positionZero + " " + position);
        sc.close();
    }
}
