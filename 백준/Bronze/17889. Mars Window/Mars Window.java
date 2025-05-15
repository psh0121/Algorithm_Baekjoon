import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int year = sc.nextInt();
        int possibleMonth = 2018 * 12 + 4;
        int month = year * 12;

        while (possibleMonth <= month) {
            possibleMonth += 26;
        }

        if(possibleMonth - month <= 12) System.out.println("yes");
        else System.out.println("no");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
