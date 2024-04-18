import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int leg = sc.nextInt();
    		int chicken = sc.nextInt();
    		
    		int disLeg = chicken * 2 - leg;
    		
    		System.out.println(disLeg + " " + (chicken-disLeg));
    	}
    	
    	sc.close();
    }
}