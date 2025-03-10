import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("#")) break;

            int s = (int)str.charAt(str.length() - 1) - 'A';

            // 복호화한 값에 대해 재 설정후 값을 넣는다.
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length() - 1; i++) {
                char letter = str.charAt(i);

                // 어떤 문자에 대해 해당 값이 알파벳이 아니라면 그냥 넣는다.
                if(
                    (int)Character.toUpperCase(letter) < 65 || 
                    (int)Character.toUpperCase(letter) > 90
                ) {
                    sb.append(letter);
                    continue;
                }

                // 그외엔 값을 복호화 하여 넣어준다.
                int calNum = (int)Character.toUpperCase(letter) - s;
                if(calNum < 65) {
                    calNum += 26;
                }

                // 대소문자 구문하여 값을 넣는다.
                if(letter == Character.toUpperCase(letter)) {
                    sb.append((char)calNum);
                }
                else {
                    sb.append(Character.toLowerCase((char)calNum));
                }
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}