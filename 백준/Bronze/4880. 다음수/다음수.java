import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int a1 = sc.nextInt();
    		int a2 = sc.nextInt();
    		int a3 = sc.nextInt();
    		
    		if(a1 == 0 && a2 == 0 && a3 == 0) break;
    		
    		// AP
    		if(a2 - a1 == a3 - a2) System.out.println("AP " + (a3 + (a3 - a2)));
    		
    		// GP
    		else System.out.println("GP " + (a3 * (a3 / a2)));
    	}
    	sc.close();
    }
}