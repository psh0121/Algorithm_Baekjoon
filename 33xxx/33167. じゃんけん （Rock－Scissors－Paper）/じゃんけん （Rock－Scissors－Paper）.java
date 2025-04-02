import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int sWin = 0;
        int tWin = 0;

        for(int i = 0; i < n; i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);

            if(sLetter == tLetter) continue;

            if(sLetter == 'R') tWin++;
            else {
                if(tLetter == 'P') sWin++;
                else tWin++;
            }
        }

        System.out.println(sWin + " " + tWin);
        sc.close();
    }
}