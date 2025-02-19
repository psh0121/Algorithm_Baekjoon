import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String p1 = sc.next();
            String p2 = sc.next();

            if(p1.equals("E")) break;

            int p1Cnt = 0;
            int p2Cnt = 0;

            for(int i = 0; i < p1.length(); i++) {
                char game1 = p1.charAt(i);
                char game2 = p2.charAt(i);

                if(game1 == 'R' && game2 == 'S') p1Cnt++;
                else if(game1 == 'S' && game2 == 'P') p1Cnt++;
                else if(game1 == 'P' && game2 == 'R') p1Cnt++;
                else if(game1 == 'S' && game2 == 'R') p2Cnt++;
                else if(game1 == 'P' && game2 == 'S') p2Cnt++;
                else if(game1 == 'R' && game2 == 'P') p2Cnt++;
            }

            System.out.println("P1: " + p1Cnt);
            System.out.println("P2: " + p2Cnt);
        }
        sc.close();
    }
}
