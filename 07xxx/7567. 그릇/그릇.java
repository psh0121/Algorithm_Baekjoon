import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String dishes = sc.next();
		int cm = 0;

		for(int i = 0; i < dishes.length(); i++) {
			if(i == 0) {
				cm += 10;
				continue;
			}

			if(dishes.charAt(i-1) == dishes.charAt(i)) {
				cm += 5;
			}
			else {
				cm += 10;
			}
		}

		System.out.println(cm);
		sc.close();
    }
}
