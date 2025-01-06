import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        int key = (int)'C' ^ (int)code.charAt(0);
        String result = "";

        for(int i = 0; i < code.length(); i++) {
          int getValue = (int)code.charAt(i) ^ key;
          result += (char)getValue;
        }

        System.out.println(result);
        sc.close();
    }
}