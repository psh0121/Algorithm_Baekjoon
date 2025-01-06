import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 1;
        for(int i = 0; i < n; i++) {
          int card = sc.nextInt();
          if(card == 0) card = 1;
          result = (result * card) % m;
        }

        System.out.println(result % m);
        sc.close();
    }
}