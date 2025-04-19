import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        // 2진수 -> 8진수 : 3자리씩 끊어서 계산한다
        String binary = sc.next();

        // 3자리씩 끊어내야하기 때문에 binary의 길이가 3으로 나누어떨어져야한다
        if(binary.length() % 3 != 0) {
            if(binary.length() % 3 == 1) binary = "00" + binary;
            else binary = "0" + binary;
        }

        // 3자리씩 끊어내서 8진수를 만들어 준다.
        StringBuilder octal = new StringBuilder();

        for(int i = 0; i < binary.length(); i+=3) {
            String binaryCut3 = binary.substring(i, i+3);
            int decimal = Integer.parseInt(binaryCut3, 2);

            octal.append("" + decimal);
        }

        String result = octal.toString().replaceFirst("^0+", "");

        System.out.println(result.length() == 0 ? "0" : result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}