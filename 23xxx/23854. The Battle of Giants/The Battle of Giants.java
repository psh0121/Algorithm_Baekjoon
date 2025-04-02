import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int winA = a/3;
        a %= 3;
        int tieA = a;

        int winB = b/3;
        b %= 3;
        int tieB = b;

        if(tieA != tieB) {
            System.out.println(-1);
            return;
        }

        System.out.println(winA + " " + tieA + " " + winB);
        sc.close();
    }
}