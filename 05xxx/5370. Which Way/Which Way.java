import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String binaryNum = Integer.toBinaryString(num);

            int zeroCnt = 0;
            int oneCnt = 0;

            for(int i = 0; i < binaryNum.length(); i++) {
                char c = binaryNum.charAt(i);
                if(c == '0') zeroCnt++;
                else oneCnt++;
            }

            if(zeroCnt > oneCnt) System.out.println("left");
            else if(zeroCnt == oneCnt) System.out.println("straight");
            else System.out.println("right");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
