import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 0;

        for(int i = 0; i < n; i++) {
            int page = sc.nextInt();

            if(page % 2 == 1) value += page + 1;
            else value += page;
        }

        System.out.println(value % 2 == 1 ? value / 2 + 1 : value  / 2);
        sc.close();
    }
}