import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int sum = 0;
    	for(int i = 0; i <= 13; i++) sum += i;
    	
    	int s = sum;
    	int b = sum;
    	int v = sum;
    	int k = sum;
    	
    	for(int i = 0; i < 51; i++) {
    		String value = sc.next();
    		
    		if(value.equals("S")) s-= sc.nextInt();
    		else if(value.equals("B")) b-= sc.nextInt();
    		else if(value.equals("V")) v-= sc.nextInt();
    		else if(value.equals("K")) k-= sc.nextInt();
    		
    	}
    	
    	if(s != 0) System.out.println("S " + s);
    	else if(b != 0) System.out.println("B " + b);
    	else if(v != 0) System.out.println("V " + v);
    	else if(k != 0) System.out.println("K " + k);
    			
    	sc.close();
    }
}