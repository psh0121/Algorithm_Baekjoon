import java.util.Scanner;

public class Main {
    public static String solve(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            StringBuilder miniSB = new StringBuilder();

            for(int j = n * (i-1) + 1; j <= n*i; j++) {
                if(i % 2 == 1) miniSB.append(j + " ");
                else {
                    String value = Integer.toString(j);
                    miniSB.append(new StringBuilder(value).reverse().toString().trim() + " ");
                }
            }
            
            if(i % 2 == 1) sb.append(miniSB.toString().trim() + "\n");
            else sb.append(miniSB.reverse().toString().trim() + "\n");
        }

        return sb.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solve(n));
        sc.close();
    }
}