import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int bringCoffee = 0;

		String[] classArr = sc.next().split("");

		for(int i = 0; i < n; i++) {
			if(classArr[i].equals("1")) {
				result++;
				bringCoffee = 2;
			}
			else {
				if(bringCoffee != 0) {
					bringCoffee--;
					result++;
				}
			}
		}

		System.out.println(result);
		sc.close(); 
    }
}
