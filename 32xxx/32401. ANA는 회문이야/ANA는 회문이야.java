import java.util.Scanner;

public class Main {
    public static boolean isBetween(String str) {
        boolean result = false;
        for(int i = 1; i < str.length() - 1; i++) {
            char letter = str.charAt(i);
            if(letter == 'A') {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int NCnt (String str) {
        int result = 0;

        for(int i = 1; i < str.length() - 1 ; i++) {
            char letter = str.charAt(i);
            if(letter == 'N') result++;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int start = 0;
        int end = 1;

        int cnt = 0;

        while (end < s.length()) {
            String subStr = s.substring(start, end+1);

            if(
                subStr.length() >= 3 &&
                subStr.charAt(0) == 'A' &&
                subStr.charAt(subStr.length() - 1) == 'A' &&
                isBetween(subStr) == false &&
                NCnt(subStr) == 1
                ) {
                    cnt++;
                    start = end;
                    end = start + 1;
            }
            else if(subStr.charAt(0) != 'A') {
                start = end;
                end = start + 1;
            }
            else if(
                subStr.charAt(0) == 'A' &&
                subStr.charAt(subStr.length() - 1) != 'A'
            ) {
                end++;
            }
            else {
                start = end;
                end = start + 1;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
