import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            if(day == 0 && month == 0 && year == 0) break;

            // 날짜기반 암호 계산
            int s = (day + month + year) % 25 + 1;
            sc.nextLine();

            String password = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            // 암호 복호화
            for(int i = 0; i < password.length(); i++) {
                char letter = password.charAt(i);

                if(letter >= 'a' && letter <= 'z') {
                    char solveLetter = (char)(((int)letter - 'a' - s + 26) % 26 + 'a');
                    sb.append(solveLetter);
                }
                else {
                    // 알파벳이 아니라면 복호화하지 않고 그냥 넣는다
                    sb.append(letter);
                }
            }

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}