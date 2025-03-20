import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int num) {
        StringBuilder sbNum = new StringBuilder(Integer.toString(num));
        int reverseNum = Integer.parseInt(sbNum.reverse().toString());
        return num == reverseNum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if(isPalindrome(num)) sum += (long)num;
        }

        System.out.println(sum);
        sc.close();
    }
}