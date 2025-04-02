import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int car = sc.nextInt();
    		
    		int m = sc.nextInt();
    		for(int j = 0; j < m; j++) {
    			car += (sc.nextInt() * sc.nextInt());
    		}
    		
    		System.out.println(car);
    	}
    	
    	sc.close();
    }
}