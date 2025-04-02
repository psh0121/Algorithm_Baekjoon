import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int r = k;
        int w = n - k;

        int rCnt = 0;
        int wCnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') rCnt++;
            else wCnt++;
        }

        if(r != rCnt) System.out.println("R");
        else System.out.println("W");
    }
}