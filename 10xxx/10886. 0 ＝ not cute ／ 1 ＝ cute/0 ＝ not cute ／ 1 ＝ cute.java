import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	int yes = 0;
    	int no = 0;
    	
    	for(int i = 0; i < t; i++) {
    		int value = sc.nextInt();
    		
    		if(value == 1) yes++;
    		else no++;
    		
    		if(yes > t/2 || no > t/2) break;
    	}
    	
    	System.out.println(yes > no ? "Junhee is cute!" : "Junhee is not cute!");
    	
    	sc.close();
    }
}