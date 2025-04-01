import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String value = sc.next();
            if(value.equals("END")) break;

            int count = 0;
            String beforeLen = value;
            String curLen = "";

            while (true) {
                count++;
                curLen = Integer.toString(beforeLen.length());

                if(beforeLen.equals(curLen)) break;

                beforeLen = curLen;
            }

            System.out.println(count);
        }
        sc.close();
    }
}