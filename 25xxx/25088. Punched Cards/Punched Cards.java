import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i).append(":").append("\n");

            int r = sc.nextInt();
            int c = sc.nextInt();

            sb.append("..+").append("-+".repeat(c-1)).append("\n");

            sb.append("..|").append(".|".repeat(c-1)).append("\n");
            sb.append("+-+").append("-+".repeat(c-1)).append("\n");

            for(int j = 0; j < r-1; j++) {
                sb.append("|.|").append(".|".repeat(c-1)).append("\n");
                sb.append("+-+").append("-+".repeat(c-1)).append("\n");
            }

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}