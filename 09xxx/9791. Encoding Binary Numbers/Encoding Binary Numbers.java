import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            String binaryNum = sc.next();
            if(binaryNum.equals("0")) break;

            StringBuilder sb = new StringBuilder();

            char curNum = binaryNum.charAt(0);
            int cnt = 0;

            for(int i = 0; i < binaryNum.length(); i++) {
                char num = binaryNum.charAt(i);

                if(num == curNum) cnt++;
                else {
                    sb.append(cnt).append(curNum);

                    curNum = num;
                    cnt = 1;
                }
            }

            sb.append(cnt).append(curNum);

            System.out.println(sb.toString().trim());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}