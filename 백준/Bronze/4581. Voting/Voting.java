import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String vote = sc.next();
            if(vote.equals("#")) break;

            int y = 0;
            int n = 0;
            int p = 0;
            int a = 0;

            int total = 0;

            for(int i = 0; i < vote.length(); i++) {
                char value = vote.charAt(i);

                if(value == 'Y') y++;
                else if(value == 'N') n++;
                else if(value == 'P') p++;
                else a++;

                total = y + n + p + a;
            }

            if(a >= (double)total / 2) {
                System.out.println("need quorum");
                continue;
            }

            if(y > n) System.out.println("yes");
            else if(y == n) System.out.println("tie");
            else System.out.println("no");
        }

        sc.close();
    }
}
