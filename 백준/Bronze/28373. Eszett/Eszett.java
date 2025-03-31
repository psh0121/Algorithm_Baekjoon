import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();

        if(s.contains("sss")) {
            int ssFirstIdx = s.indexOf("ss");
            int ssLastIdx = s.lastIndexOf("ss");

            System.out.println(s);
            System.out.println(s.substring(0, ssFirstIdx) + "B" + s.substring(ssFirstIdx + 2));
            System.out.println(s.substring(0, ssLastIdx) + "B" + s.substring(ssLastIdx + 2));
        }
        else if(s.contains("ss")) {
            int ssIdx = s.indexOf("ss");
            System.out.println(s);
            System.out.println(s.substring(0, ssIdx) + 'B' + s.substring(ssIdx + 2));
        }
        else System.out.println(s);
        sc.close();
    }
}