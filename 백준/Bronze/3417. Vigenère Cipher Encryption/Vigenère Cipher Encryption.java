import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        while (true) {
            String code = sc.next();
            if(code.equals("0")) break;
            String str = sc.next();

            // 암호 아스키코드에 - 65 한 값으로 배열 설정
            int[] codeAscii = new int[code.length()];
            for(int i = 0; i < code.length(); i++) {
                char letter = code.charAt(i);
                codeAscii[i] = (int)letter - 65;
            }

            // 문자열 아스키코드에 - 65 한 값으로 배열 설정
            int[] strAscii = new int[str.length()];
            for(int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                strAscii[i] = (int)letter - 65;
            }

            // code를 반복적으로 돌아가면서 str의 문자열을 재설정 할 수 있도록 한다.
            for(int i = 0; i < strAscii.length; i++) {
                int idx = i % codeAscii.length;

                strAscii[i] += codeAscii[idx] + 1;

                if(strAscii[i] >= alphabet.length()) {
                    strAscii[i] %= 26;
                }
            }

            // 재설정한 strAscii에 대해 알파벳을 넣고 출력한다.
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < strAscii.length; i++) {
                sb.append(alphabet.charAt(strAscii[i]));
            }
            
            // 출력
            System.out.println(sb.toString());
        }
        sc.close();
    }
}