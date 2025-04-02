import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length() / 3;

        String substr1 = s.substring(0, len);
        String substr2 = s.substring(len, len*2);
        String substr3 = s.substring(len*2, len*3);

        if(substr1.equals(substr2)) System.out.println(substr1);
        else if(substr2.equals(substr3)) System.out.println(substr2);
        else System.out.println(substr1);
        sc.close();
    }
}