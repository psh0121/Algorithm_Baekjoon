import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String num = sc.next();
            StringBuilder sb = new StringBuilder();

            int startIdx = 0;
            int endIdx = 1;

            while (endIdx < num.length()) {
                char start = num.charAt(startIdx);
                char end = num.charAt(endIdx);

                if(start == end) {
                    endIdx++;
                }
                else {
                    sb.append((endIdx - startIdx) + Character.toString(start));
                    startIdx = endIdx;
                    endIdx++;
                }
            }
            sb.append((endIdx - startIdx) + Character.toString(num.charAt(startIdx)));

            System.out.println(sb.toString());
        }
        sc.close();
    }
}