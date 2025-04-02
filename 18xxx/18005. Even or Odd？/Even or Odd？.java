import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		if(n % 2 == 1) System.out.println(0);
		else if((n / 2) % 2 == 1) System.out.println(1);
		else System.out.println(2);
		sc.close();
    }
}