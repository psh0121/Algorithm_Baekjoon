import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        if(binaryX.length() != binaryY.length()) {
            if(binaryX.length() > binaryY.length()) {
                binaryY = "0".repeat(binaryX.length() - binaryY.length()) + binaryY;
            }
            else {
                binaryX = "0".repeat(binaryY.length() - binaryX.length()) + binaryX;
            }
        }

        String newBinary = "";

        for(int i = 0; i < binaryX.length(); i++) {
            newBinary += binaryX.charAt(i);
            newBinary += binaryY.charAt(i);
        }

        System.out.println(Long.parseLong(newBinary, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}