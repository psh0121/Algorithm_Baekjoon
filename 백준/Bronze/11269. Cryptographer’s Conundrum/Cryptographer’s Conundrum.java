import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "PER".repeat(str.length() / 3);

        int sameCnt = 0;

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            char letter2 = newStr.charAt(i);

            if(letter == letter2) sameCnt++;
        }

        System.out.println(str.length() - sameCnt);
        sc.close();
    }
}
