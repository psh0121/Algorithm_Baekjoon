import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		String str = sc.next();
    		
    		if(str.charAt(str.length()/2 -1) == str.charAt(str.length()/2)) System.out.println("Do-it");
    		else System.out.println("Do-it-Not");
    	}
    	
    	sc.close();
    }
}