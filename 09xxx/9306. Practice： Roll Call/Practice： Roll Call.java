import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		String last = sc.next();
    		String first = sc.next();
    		
    		System.out.print("Case " + i + ": ");
    		System.out.println(first + ", " + last);
    	}
    	
    	sc.close();
    }
}