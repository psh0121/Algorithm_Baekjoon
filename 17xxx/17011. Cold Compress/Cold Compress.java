import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder();

            int startIdx = 0;
            int endIdx = 1;

            while (endIdx < str.length()) {
                char start = str.charAt(startIdx);
                char end = str.charAt(endIdx);

                if(start == end) {
                    endIdx++;
                }
                else {
                    sb.append(endIdx-startIdx + " " + start + " ");
                    startIdx = endIdx;
                }
            }

            sb.append(endIdx - startIdx + " " + str.charAt(startIdx));

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}