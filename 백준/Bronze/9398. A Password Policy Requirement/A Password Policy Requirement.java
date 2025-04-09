import java.util.Scanner;

public class Main {
    public static boolean containLower(String str, int start, int end) {
        boolean result = false;

        for(int i = start; i <= end; i++) {
            char letter = str.charAt(i);

            if((int)letter >= 'a' && (int)letter <= 'z') {
                result = true;
                break;
            }
        }

        return result;
    }

    public static boolean containUpper(String str, int start, int end) {
        boolean result = false;

        for(int i = start; i <= end; i++) {
            char letter = str.charAt(i);

            if((int)letter >= 'A' && (int)letter <= 'Z') {
                result = true;
                break;
            }
        }

        return result;
    }

    public static boolean containNumber(String str, int start, int end) {
        boolean result = false;

        for(int i = start; i <= end; i++) {
            char letter = str.charAt(i);

            if((int)letter >= '0' && (int)letter <= '9') {
                result = true;
                break;
            }
        }

        return result;
    }

    public static int solve(String str) {
        int start = 0;
        int end = str.length() - 1;

        boolean isStartMove = true;
        while (isStartMove) {
            int startTemp = start + 1;
            if((end-startTemp+1) >= 6 && containLower(str, startTemp, end) &&
            containUpper(str, startTemp, end) && containNumber(str, startTemp, end)) {
                start = startTemp;
            }
            else {
                isStartMove = false;
            }
        }

        boolean isEndMove = true;
        while (isEndMove) {
            int endTemp = end - 1;
            if((endTemp-start+1) >= 6 && containLower(str, start, endTemp) &&
            containUpper(str, start, endTemp) && containNumber(str, start, endTemp)) {
                end = endTemp;
            }
            else {
                isEndMove = false;
            }
        }

        if(end-start+1 == str.length()) {
            if(
                str.length() >= 6 && containLower(str, start, end) &&
                containUpper(str, start, end) && containNumber(str, start, end)
            ) {}
            else return 0;
        }
 
        return end - start + 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc.next()));
        }
    }
}
