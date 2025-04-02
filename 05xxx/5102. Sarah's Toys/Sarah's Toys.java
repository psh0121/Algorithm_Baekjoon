import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		if(a == 0 && b == 0) break;
    		
    		int diff = a - b;
    		
    		if(diff < 2) System.out.println("0 0");
    		else if(diff % 2 == 0) System.out.println(diff / 2 + " 0");
    		else System.out.println(diff / 2 - 1 + " 1");
    	}
    	
    	sc.close();
    }
}