import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a = 0, b = 0;
    	
    	for(int i = 0; i < n; i++) {
    		int ag = sc.nextInt();
    		int bg = sc.nextInt();
    		
    		if(ag > bg) a++;
    		else if(ag < bg) b++;
    	}
    	
    	System.out.println(a + " " + b);
    	sc.close();
    }
}