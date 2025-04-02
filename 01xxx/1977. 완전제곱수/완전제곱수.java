import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int minValue = -1;
		int sumValue = 0;

		int num = 1;

		while (num * num <= n) {
			if(num * num >= m && num * num <= n) {
				if(minValue == -1) {
					minValue = num * num;
				}
				sumValue += num * num;
			}
			num++;
		}

		if(minValue == -1) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(sumValue);
		System.out.println(minValue);
		sc.close();
    }
}
