import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int milk = sc.nextInt();
    	int honey = sc.nextInt();
    	
    	int n = sc.nextInt();
    	
    	int total = 0;
    	
    	for(int i = 0; i < n; i++) {
    		int cow = sc.nextInt();
    		int bee = sc.nextInt();
    		
    		total += Math.max(cow*milk, bee*honey);
    	}
    	
    	System.out.println(total);
    	
    	sc.close();
    }
}