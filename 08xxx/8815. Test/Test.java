import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String rotation = " ABCBCDCDADAB";
    	
    	for(int i = 0; i < n; i++) {
    		int value = sc.nextInt() % 12;
    		
    		if(value == 0) {
    			System.out.println('B');
    		}
    		else {
    			System.out.println(rotation.charAt(value));
    		}
    	}
    	
    	sc.close();
    }
}