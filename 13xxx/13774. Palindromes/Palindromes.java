import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();

        return str.equals(reverseStr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str = sc.next();
            if(str.equals("#")) break;

            boolean palindromeFlag = false;
            String palindromeStr = "";

            for(int i = 0; i < str.length(); i++) {
                String cutStr = str.substring(0, i) + str.substring(i+1, str.length());

                if(isPalindrome(cutStr)) {
                    palindromeFlag = true;
                    palindromeStr = cutStr;
                    break;
                }
            }

            System.out.println(palindromeFlag ? palindromeStr : "not possible");
        }
        sc.close();
    }
}