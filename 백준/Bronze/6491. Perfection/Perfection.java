import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		int num = sc.nextInt();
    		if(num == 0) break;
    		
    		int sum = 0;
    		for(int i = 1; i <= num / 2; i++) {
    			if(num % i == 0) sum += i;
    		}
    		
    		if(sum == num) System.out.println(num + " PERFECT");
    		else if(sum < num) System.out.println(num + " DEFICIENT");
    		else System.out.println(num + " ABUNDANT");
    	}
    	
    	sc.close();
    }
}