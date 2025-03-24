import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            long num = sc.nextLong();

            if(num == -1) break;

            String num2 = Long.toBinaryString(num);
            num2 = String.format("%32s", num2).replace(" ", "0");
            String reverseNum2 = new StringBuilder(num2).reverse().toString();
            long num10 = Long.parseLong(reverseNum2, 2);

            System.out.println(num10);
        }

        sc.close();
    }
}