import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            
            // length <= 10
            if(name.length() > 10) continue;

            // alphabetCnt >= 1
            int small = 0;
            int big = 0;
            boolean containBar = name.contains("-") ? true : false;

            for(int j = 0; j < name.length(); j++) {
                char letter = name.charAt(j);
                int letterAscii = (int)letter;

                if(letterAscii >= 97 && letterAscii <= 122) {
                    small++;
                }
                else if(letterAscii >= 65 && letterAscii <= 90) {
                    big++;
                }
            }

            if((small == 0 && big == 0) && !containBar) continue;

            // smallCnt >= bigCnt
            if(small >= big) {
                System.out.println(name);
                return;
            }

        }
        sc.close();
    }
}
