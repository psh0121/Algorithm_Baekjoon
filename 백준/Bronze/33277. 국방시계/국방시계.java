import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double divideMN = (double)m / (double)n;
        int hh = (int)(divideMN * 24);
        int mm = (int)((divideMN * 24 - hh) * 60);

        System.out.printf("%02d:%02d", hh, mm);
        sc.close();
    }
}