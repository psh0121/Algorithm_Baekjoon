import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a+b == 50) System.out.println(49);
			else System.out.println(50);
		}
		sc.close();
    }
}