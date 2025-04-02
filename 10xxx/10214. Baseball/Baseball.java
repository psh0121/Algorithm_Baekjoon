import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int y = 0;
    		int k = 0;
    		
    		for(int j = 0; j < 9; j++) {
    			int yGrade = sc.nextInt();
    			int kGrade = sc.nextInt();
    			
    			y += yGrade;
    			k += kGrade;
    		}
    		
    		if(y > k) System.out.println("Yonsei");
    		else if(y == k) System.out.println("Draw");
    		else System.out.println("Korea");
    	}
    	
    	sc.close();
    }
}