import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("YES");

            int num = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for(int j = 1; j <= num; j++) sb.append(j + " ");

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}
