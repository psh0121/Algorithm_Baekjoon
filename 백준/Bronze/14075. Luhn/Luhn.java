import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split("");
		int[] cardNum = new int[strArr.length];
		for(int i = 0; i < cardNum.length; i++) {
			cardNum[i] = Integer.parseInt(strArr[i]);
		}

		for(int i = 0; i < cardNum.length; i+=2) {
			cardNum[i] *= 2;

			if(cardNum[i] >= 10) {
				int overNum = cardNum[i];

				cardNum[i] = overNum/10 + overNum%10;
			}
		}

		int sum = 0;
		for(int i = 0; i < cardNum.length; i++) sum += cardNum[i];

		if(sum % 10 == 0) System.out.println("DA");
		else System.out.println("NE");
        sc.close();
    }
}
