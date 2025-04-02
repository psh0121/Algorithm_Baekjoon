import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int distance = sc.nextInt();
    	int k = sc.nextInt();
    	int a = sc.nextInt();
    	
    	while(true) {
    		distance -= k;
    		
    		if(distance < 0) {
    			System.out.println(1);
    			break;
    		}
    		
    		distance -= a;
    		
    		if(distance < 0) {
    			System.out.println(0);
    			break;
    		}
    	}
    	
    	sc.close();
    }
}