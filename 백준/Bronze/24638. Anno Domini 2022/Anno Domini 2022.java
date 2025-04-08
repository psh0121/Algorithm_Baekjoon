import java.util.Scanner;

public class Main {
    public static int solve(String s1, String s2, String s3, String s4) {
        String adbc1 = "";
        int year1 = 0;
        String adbc2 = "";
        int year2 = 0;
        
        if(s1.equals("AD")) {
            adbc1 = "AD";
            year1 = Integer.parseInt(s2);
        }
        else {
            adbc1 = "BC";
            year1 = Integer.parseInt(s1);
        }

        if(s3.equals("AD")) {
            adbc2 = "AD";
            year2 = Integer.parseInt(s4);
        }
        else {
            adbc2 = "BC";
            year2 = Integer.parseInt(s3);
        }

        int result = 0;

        if((adbc1.equals("AD") && adbc2.equals("AD")) ||
        (adbc1.equals("BC") && adbc2.equals("BC"))) {
            result = Math.abs(year1 - year2);
        }
        else {
            result = Math.abs(year1 + year2 - 1);
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.next(), sc.next(), sc.next(), sc.next()));
        sc.close();
    }
}
