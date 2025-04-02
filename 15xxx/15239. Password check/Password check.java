import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String specialStr = "+_)(*&^%$#@!./,;{}";
        String numbers = "0123456789";

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String password = sc.next();

            // 길이 검사
            if(n < 12) {
                System.out.println("invalid");
                continue;
            }

            // 소문자, 대문자, 특수문자개수, 숫자 파악
            int small = 0;
            int big = 0;
            int special = 0;
            int number = 0;

            for(int j = 0; j < n; j++) {
                char letter = password.charAt(j);

                if(specialStr.contains(Character.toString(letter))) special++;
                else if(numbers.contains(Character.toString(letter))) number++;
                else if((int)letter >= 65 && (int)letter <= 90) big++;
                else small++;
            }

            if(small != 0 && big != 0 && special != 0 && number != 0) System.out.println("valid");
            else System.out.println("invalid");
        }
        sc.close();
    }
}
