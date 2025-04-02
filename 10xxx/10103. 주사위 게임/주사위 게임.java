import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int a = 100;
    	int b = 100;
    	
    	for(int i = 0; i < n; i++) {
    		int g1 = sc.nextInt();
    		int g2 = sc.nextInt();
    		
    		if(g1 > g2) b -= g1;
    		else if(g1 < g2) a -= g2;
    	}
    	
    	System.out.println(a);
    	System.out.println(b);
    	
    	sc.close();
    }
}