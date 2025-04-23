import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            String name = sc.next();
            int f = sc.nextInt();

            if(name.equals("#") && f == 0) break;

            System.out.println(name + " Library");

            int c = sc.nextInt();

            for(int i = 1; i <= c; i++) {
                int w = sc.nextInt();
                String s = sc.next();
                int width = f * s.length() + 2; // 앞뒤여백필요

                if(width <= w) {
                    System.out.println("Book " + i + " horizontal");
                }
                else System.out.println("Book " + i + " vertical");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}