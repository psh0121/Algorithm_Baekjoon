import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String s = sc.next();
        String t = sc.next();

        String result = t.replaceAll("["+s+"]", "");

        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

