import java.util.Scanner;

public class Main {
    public static String solve(Scanner sc) {
        String result = "The longest contiguous subsequence of X's is of length ";
        int maxLen = 0;

        int n = sc.nextInt();
        String temp = "";

        for(int i = 0; i < n; i++) temp += sc.next();

        temp = temp.replaceAll("[O ]", "|");
        String[] arr = temp.split("\\|");

        for(int i = 0; i < arr.length; i++) {
            maxLen = Math.max(maxLen, arr[i].length());
        }

        return result + maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(solve(sc));
        }
        sc.close();
    }
}