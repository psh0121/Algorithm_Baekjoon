import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int distance = 0;

        for(int i = 1; i <= x; i++) {
            if(i % 2 == 1) distance += 3;
            else distance -= 2;
        }

        System.out.println(distance);

        sc.close();
    }
}