import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String gan10 = "9012345678";
		String gan12 = "FGHIJKLABCDE";

		int n = sc.nextInt();
		int nMinus2013 = n - 2013;

		int gan10Mod = nMinus2013 % 10;
		int gan12Mod = nMinus2013 % 12;

		if(gan10Mod < 0) gan10Mod = 10 + gan10Mod;
		if(gan12Mod < 0) gan12Mod = 12 + gan12Mod;

		String result = "" + gan12.charAt(gan12Mod) + gan10.charAt(gan10Mod);
		System.out.println(result);
		sc.close();
    }
}
