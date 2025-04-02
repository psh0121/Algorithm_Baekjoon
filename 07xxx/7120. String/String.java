import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        int startIdx = 0;
        int compareIdx = 1;

        sb.append(str.charAt(startIdx));

        while (compareIdx < str.length()) {
            char start = str.charAt(startIdx);
            char compare = str.charAt(compareIdx);

            if(start == compare) compareIdx++;
            else if(start != compare) {
                sb.append(str.charAt(compareIdx));
                startIdx = compareIdx;
                compareIdx++;
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
