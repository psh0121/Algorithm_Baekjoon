import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int m = sc.nextInt();
        int d = sc.nextInt();

        String[] arr = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int days = 0;

        for(int i = 1; i < m; i++) {
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                days += 31;
            }
            else if(i == 2) {
                days += 28;
            }
            else {
                days += 30;
            }
        }

        days += d;
        days -= 1;

        System.out.println(arr[days % 7]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}