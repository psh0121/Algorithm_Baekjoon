import java.util.Scanner;

public class Main {
    public static boolean solve(String s) {
        return s.charAt(0) != s.charAt(s.length() - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solve(str) ? "Win" : "Lose");
        sc.close();
    }
}
