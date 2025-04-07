import java.util.Scanner;

public class Main {
    public static String solve(long num) {
        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 3);
            num /= 3;
        }

        return sb.reverse().toString().trim();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long value = sc.nextLong();
            System.out.println(solve(value)); 
        }
        sc.close();
    }
}
