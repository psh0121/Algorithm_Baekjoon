import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binaryN = Integer.toBinaryString(n);

		for(int i = binaryN.length() - 1; i >= 0; i--) {
			if(binaryN.charAt(i) == '1') System.out.print((binaryN.length() - i - 1) + " ");
		}
		
		sc.close();
    }
}