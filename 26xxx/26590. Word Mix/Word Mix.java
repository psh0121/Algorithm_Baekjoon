import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int len = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if(i % 2 == 0) sb.append(s1.charAt(i));
            else sb.append(s2.charAt(i));
        }

        System.out.println(sb.toString());
        sc.close();
    }
}