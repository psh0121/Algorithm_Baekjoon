import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int carlos = sc.nextInt();

		for(int i = 0; i < n - 1; i++) {
			int person = sc.nextInt();

			if(person > carlos) {
				System.out.println("N");
				return;
			}
		}

		System.out.println("S");
		sc.close();
    }
}