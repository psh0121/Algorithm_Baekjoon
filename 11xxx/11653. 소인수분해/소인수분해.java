import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if(n == 1) return;

        int i = 2;
        int divideN = n;

        while (divideN > i) {
            if(divideN % i == 0) {
                sb.append(i).append("\n");
                divideN /= i;
            }
            else i++;
        }

        sb.append(divideN).append("\n");

        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
