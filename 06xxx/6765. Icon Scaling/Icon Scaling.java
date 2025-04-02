import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= k; i++) {
            sb.append("*".repeat(k)).append("x".repeat(k)).append("*".repeat(k)).append("\n");
        }

        for(int i = 1; i <= k; i++) {
            sb.append(" ".repeat(k)).append("x".repeat(k)).append("x".repeat(k)).append("\n");
        }

        for(int i = 1; i <= k; i++) {
            sb.append("*".repeat(k)).append(" ".repeat(k)).append("*".repeat(k)).append("\n");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}