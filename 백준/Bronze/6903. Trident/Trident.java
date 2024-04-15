import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();	// 높이 
    	int s = sc.nextInt();	// 여백 
    	int h = sc.nextInt();	// 손잡이 	
    	
    	for(int i = 0; i < t; i++) {
    		for(int j = 0; j < 2; j++) {
    			System.out.print("*" + " ".repeat(s));
    		}
    		System.out.println("*");
    	}
    	
    	System.out.println("*".repeat((s+1) * 2 + 1));
    	
    	for(int i = 0; i < h; i++) {
    		System.out.println(" ".repeat(s + 1) + "*");
    	}
    	sc.close();
    }
}