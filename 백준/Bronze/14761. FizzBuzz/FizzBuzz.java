import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		int num = i;
    		
    		if(num % x == 0 && num % y == 0) {
    			System.out.println("FizzBuzz");
    		}
    		else if(num % x == 0) {
    			System.out.println("Fizz");
    		}
    		else if(num % y == 0) {
    			System.out.println("Buzz");
    		}
    		else System.out.println(i);
    	}
    	
    	sc.close();
    }
}