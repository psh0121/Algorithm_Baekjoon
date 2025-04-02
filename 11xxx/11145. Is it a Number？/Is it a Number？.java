import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String num = sc.nextLine().trim();  // 앞뒤 공백제거

            // 중간에 공백있으면 invalid input
            if(num.contains(" ")) {
                System.out.println("invalid input");
                continue;
            }

            // 문자가 포함되어있다면 invalid input
            // \\d+ : 숫자로만 이루어져있는 하나 이상의 문자
            if(!num.matches("\\d+")) {
                System.out.println("invalid input");
                continue;
            }

            // 선행 0을 제거한다
            // ^0+ : 문자열 맨 앞에 있는 연속된 0들
            num = num.replaceFirst("^0+", "");

            // 출력
            System.out.println(num.length() == 0 ? "0" : num);

        }
        sc.close();
    }
}