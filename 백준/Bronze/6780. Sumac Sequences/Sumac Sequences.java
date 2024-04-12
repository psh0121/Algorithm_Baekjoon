import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int n = 2;
    	
    	while(true) {
    		n++;
    		int c = a - b;
    		
    		if(b < c) break;
    		
    		a = b;
    		b = c;
    	}
    	
    	System.out.println(n);
    	
    	sc.close();
    }
}