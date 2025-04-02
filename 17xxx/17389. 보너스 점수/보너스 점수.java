import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String value = sc.next();
		int sum = 0;
		int vonus = 0;

		for(int i = 0; i < n; i++) {
			if(value.charAt(i) == 'O') {
				sum += i+1 + vonus;
				vonus++;
			}
			else vonus = 0;
		}

		System.out.println(sum);
		sc.close();
    }
}
