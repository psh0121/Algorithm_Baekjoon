import java.util.Scanner;

public class Main {
    public static int solve(int a, int b, int c, int t) {
        int fee = a;

        if(t > 30) {
            fee += (t-30) / b * c;

            if((t-30) % b != 0) fee += c;
        }

        return fee;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = sc.nextInt();

        System.out.println(solve(a, b, c, t));
        sc.close();
    }
}