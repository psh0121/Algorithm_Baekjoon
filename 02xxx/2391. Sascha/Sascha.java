import java.util.Scanner;

public class Main {
    public static int getDifferentCnt(String sascha, String s) {
        int cnt = 0;

        for(int i = 0; i < sascha.length(); i++) {
            if(sascha.charAt(i) != s.charAt(i)) cnt++;
        }

        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String sascha = sc.next();

            int m = sc.nextInt();
            String result = sc.next();
            m--;

            while (m-- > 0) {
                String s = sc.next();

                if(getDifferentCnt(sascha, s) < getDifferentCnt(sascha, result)) {
                    result = s;
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}