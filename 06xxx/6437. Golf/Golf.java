import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int idx = 1;
    	
    	while(true) {
    		int p = sc.nextInt();
    		int s = sc.nextInt();
    		if(p == 0 && s == 0) break;
    		
    		System.out.println("Hole #" + idx++);
    		
    		int differ = p-s;
    		
    		if(s == 1) System.out.println("Hole-in-one.");
    		else if(differ == 3) System.out.println("Double eagle.");
    		else if(differ == 2) System.out.println("Eagle.");
    		else if(differ == 1) System.out.println("Bridie.");
    		else if(differ == 0) System.out.println("Par.");
    		else if(differ == -1) System.out.println("Bogey.");
    		else System.out.println("Double Bogey.");
    		
    		System.out.println();
    	}
    	
    	sc.close();
    }
}