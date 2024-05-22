import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	System.out.printf("%d", n);
    	
    	while(n != 1) {
    		if(n % 2 == 0) n /= 2;
    		else n = 3 * n + 1;
    		
    		System.out.printf(" %d", n);
    	}
    	
    	sc.close();
    }
}