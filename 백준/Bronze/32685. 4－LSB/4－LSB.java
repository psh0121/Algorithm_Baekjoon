import java.util.Scanner;

public class Main {
    public static String change4LSB (String binaryNum) {
        String result = "";

        if(binaryNum.length() < 4) {
            result = "0".repeat(4-binaryNum.length()) + binaryNum;
        }
        else {
            result = binaryNum.substring(binaryNum.length() - 4);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String BinaryA = Integer.toBinaryString(a);
        String BinaryB = Integer.toBinaryString(b);
        String BinaryC = Integer.toBinaryString(c);

        String lsbA = change4LSB(BinaryA);
        String lsbB = change4LSB(BinaryB);
        String lsbC = change4LSB(BinaryC);

        String abc = lsbA + lsbB + lsbC;

        int abc10 = Integer.parseInt(abc, 2);

        System.out.printf("%04d", abc10);
        sc.close();
    }
}
