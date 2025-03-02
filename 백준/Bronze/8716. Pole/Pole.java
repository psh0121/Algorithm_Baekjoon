import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int left = Math.max(x1, x3);
        int top = Math.min(y1, y3);
        int right = Math.min(x2, x4);
        int bottom = Math.max(y2, y4);

        int width = right - left;
        int height = top - bottom;

        if(width <= 0 || height <= 0) System.out.println(0);
        else System.out.println((long)width * height);

        sc.close();
    }
}
