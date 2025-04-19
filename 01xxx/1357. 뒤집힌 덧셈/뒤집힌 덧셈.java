import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        StringBuilder x = new StringBuilder(sc.next());
        StringBuilder y = new StringBuilder(sc.next());

        int revX = Integer.parseInt(x.reverse().toString());
        int revY = Integer.parseInt(y.reverse().toString());

        int revXY = Integer.parseInt(new StringBuilder(Integer.toString(revX + revY)).reverse().toString());

        System.out.println(revXY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}