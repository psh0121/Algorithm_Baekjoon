import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String cry = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append("AWAWHO");

        if(cry.length() >= sb.length()) {
            sb.append("O".repeat(cry.length() - sb.length() + 1));
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}