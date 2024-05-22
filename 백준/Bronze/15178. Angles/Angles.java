import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		
    		if(a + b + c == 180) {
    			System.out.printf("%d %d %d Seems OK\n", a, b, c);
    		}
    		else {
    			System.out.printf("%d %d %d Check\n", a, b, c);
    		}
    	}
    	sc.close();
    }
}