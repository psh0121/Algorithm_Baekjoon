import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sec = (long)0;

		int divideN = n / 5;

		for(int i = 1; i <= divideN; i++) {
			sec += 1l * 150 * i;
		}

		sec += 1l * (divideN+1) * 30 * (n % 5);

		System.out.println(sec);
		sc.close();
    }
}
