import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String[] cardNum = sc.next().split("");
			for(int j = 0; j < 16; j++) {
				if(j % 2 != 0) continue;
				
				int num = Integer.parseInt(cardNum[j]) * 2;
				if(num >= 10) num = num/10 + num%10;
				cardNum[j] = Integer.toString(num);
			}

			int sum = 0;
			for(int j = 0; j < 16; j++) {
				sum += Integer.parseInt(cardNum[j]);
			}

			System.out.println(sum % 10 == 0 ? "T" : "F");
		}
		sc.close();
    }
}
