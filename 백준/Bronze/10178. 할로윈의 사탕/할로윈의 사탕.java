import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int candy = sc.nextInt();
    		int divide = sc.nextInt();
    		
    		System.out.println("You get " + (candy/divide) + " piece(s) and your dad gets " + (candy%divide) + " piece(s).");
    	}
    	
    	sc.close();
    }
}