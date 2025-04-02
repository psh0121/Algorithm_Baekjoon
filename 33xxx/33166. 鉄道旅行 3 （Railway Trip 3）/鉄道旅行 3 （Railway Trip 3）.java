import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int fee = 0;

        if(q >= p) {
            fee += p * a;
            fee += (q-p) * b;
        }
        else {
            fee += q * a;
        }

        System.out.println(fee);
        sc.close();
    }
}