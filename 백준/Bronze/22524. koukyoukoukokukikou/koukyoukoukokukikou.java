import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String qwert = "qwertasdfgzxcvb";

        while (true) {
            String str = sc.next();
            if(str.equals("#")) break;
            char hand = 'l';

            int cnt = 0;

            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                char curHand = qwert.contains(Character.toString(c)) ? 'l' : 'r';
                
                if(i == 0) {
                    hand = curHand;
                }
                else {
                    if(hand != curHand) {
                        hand = curHand;
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}