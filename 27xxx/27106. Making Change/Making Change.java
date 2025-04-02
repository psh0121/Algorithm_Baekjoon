import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = 100 - sc.nextInt();
        int[] arr = new int[4];

        arr[0] = change / 25;
        change %= 25;
        arr[1] = change / 10;
        change %= 10;
        arr[2] = change / 5;
        change %= 5;
        arr[3] = change;

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        sc.close();
    }
}
