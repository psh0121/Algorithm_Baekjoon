import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int a1 = sc.nextInt();
    		int d = sc.nextInt();
    		int an = sc.nextInt();
    		
    		if(a1 == 0 && d == 0 && an == 0) break;
    		
    		int result = (an-a1)/d + 1;
    		
    		if((an - a1) % d == 0 && result > 0) System.out.println(result);
    		else System.out.println("X");
    	}
    	
    	sc.close();
    }
}