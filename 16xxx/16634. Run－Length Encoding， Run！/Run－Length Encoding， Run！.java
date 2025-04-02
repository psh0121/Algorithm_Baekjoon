import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char type = sc.next().charAt(0);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        if(type == 'E') {
            int left = 0;
            int right = 0;

            while (right < str.length()) {
                if(str.charAt(left) == str.charAt(right)) {
                    right++;
                }
                else {
                    sb.append(Character.toString(str.charAt(left))).append(right - left);
                    left = right;
                    right++;
                }
            }

            sb.append(Character.toString(str.charAt(left))).append(right - left);

        }
        else {
            int alpha = 0;
            int cnt = 1;

            while (cnt < str.length()) {
                sb.append(Character.toString(str.charAt(alpha)).repeat(str.charAt(cnt) - '0'));
                alpha += 2;
                cnt += 2;
            }
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}