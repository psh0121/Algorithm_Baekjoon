import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            char[] num = number.toCharArray();
            if(num[0] == '#') break;

            long sum = 0;
            int gop = 2;

            for(int i = num.length - 1; i >= 0; i--) {
                int value = num[i] - '0';
                sum += (value * gop++);
            }

            long modSum = sum % 11;
            long result = 11 - modSum;

            if(result == 10) System.out.println(number + " -> Rejected");
            else if(result == 11) System.out.println(number + " -> 0");
            else System.out.println(number + " -> " + result);
        }
        sc.close();
    }
}