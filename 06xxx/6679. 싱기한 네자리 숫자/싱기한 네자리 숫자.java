import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i = 1000; i <= 9999; i++) {
			String num10 = Integer.toString(i);
			String num12 = Integer.toString(i, 12);
			String num16 = Integer.toString(i, 16);

			int sum10 = 0;
			int sum12 = 0;
			int sum16 = 0;

			for(int j = 0; j < num10.length(); j++) {
				sum10 += Character.getNumericValue(num10.charAt(j));
			}

			for(int j = 0; j < num12.length(); j++) {
				sum12 += Character.getNumericValue(num12.charAt(j));
			}

			for(int j = 0; j < num16.length(); j++) {
				sum16 += Character.getNumericValue(num16.charAt(j));
			}

			if(sum10 == sum12 && sum12 == sum16) System.out.println(i);
		}
		sc.close();
    }
}
