import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int minOdd = 0;

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sum += num;

			if(num % 2 == 1) {
				if(minOdd == 0) minOdd = num;
				else minOdd = Math.min(minOdd, num);
			}
		}

		if(sum % 2 == 0) System.out.println(sum / 2);
		else {
			if(minOdd == 0) System.out.println(0);
			else System.out.println((sum - minOdd) / 2);
		}
		sc.close();
    }
}
