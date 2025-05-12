import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            String word1 = sc.next();
            String word2 = sc.next();
            int len = word1.length();
            int getCoin = 0;

            for(int i = 0; i < len; i++) {
                char c1 = word1.charAt(i);
                char c2 = word2.charAt(i);

                if(c1 < c2) getCoin -= (c2 - c1 - 1) + 1;
                else if(c1 == c2) getCoin += 0;
                else getCoin += (c1 - c2 - 1) + 1;
            }

            System.out.printf("Swapping letters to make %s look like %s ", word1, word2);
            
            if(getCoin > 0) System.out.println("earned " + getCoin + " coins.");
            else if(getCoin < 0) System.out.println("cost " + Math.abs(getCoin) + " coins.");
            else System.out.println("was FREE.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
