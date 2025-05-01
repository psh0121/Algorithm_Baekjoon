import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int realTotal = 0;
        int receiptTotal = 0;

        while (true) {
            String menu = sc.nextLine();
            if(menu.equals("TOTAL")) {
                receiptTotal = Integer.parseInt(sc.nextLine());
                break;
            }

            String[] temp = sc.nextLine().split(" ");
            int cal = Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
            realTotal += cal;
        }

        if(realTotal < receiptTotal) System.out.println("PROTEST");
        else System.out.println("PAY");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
