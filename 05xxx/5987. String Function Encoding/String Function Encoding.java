import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int idx = sc.nextInt();
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder(sc.next());

            for(int i = 1; i <= n; i++) {
                String cutSB = sb.substring(idx);
                sb.insert(0, cutSB);
            }

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}