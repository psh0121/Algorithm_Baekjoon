import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = 2024;
        int month = 8;

        int n = sc.nextInt() - 1;

        month += n * 7;

        while (month > 12) {
            year++;
            month -= 12;
        }

        System.out.println(year + " " + month);
        sc.close();
    }
}