import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long i = n;

		while (true) {
			int sum = 0;
			String strI = Long.toString(i);

			for(int j = 0; j < strI.length(); j++) {
				sum += Character.getNumericValue(strI.charAt(j));
			}

			if(i % sum == 0) {
				System.out.println(i);
				break;
			}

			i++;
		}
		
		sc.close();
    }
}