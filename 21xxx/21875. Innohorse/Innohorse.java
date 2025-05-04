import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String x = sc.next();
        String y = sc.next();

        int x0 = alphabet.indexOf(Character.toString(x.charAt(0)));
        int y0 = alphabet.indexOf(Character.toString(y.charAt(0)));
        int x1 = Integer.parseInt(Character.toString(x.charAt(1)));
        int y1 = Integer.parseInt(Character.toString(y.charAt(1)));

        int cal1 = Math.abs(x0 - y0);
        int cal2 = Math.abs(x1 - y1);

        System.out.println(Math.min(cal1, cal2) + " " + Math.max(cal1, cal2));
        sc.close();
    }
}
