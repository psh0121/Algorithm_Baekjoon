import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	double golden = (1 + Math.sqrt(5)) / 2;	// 황금비율 
    	double tolerance = golden * 0.01;	// 허용오차
    	
    	for(int i = 0; i < t; i++) {
    		double num1 = sc.nextDouble();
    		double num2 = sc.nextDouble();
    		
    		double ratio = num1 / num2;	// 비율 
    		double differ = Math.abs(ratio - golden);	// 오차범위 	
    		
    		if(differ <= tolerance) System.out.println("golden");
    		else System.out.println("not");
    	}
    	
    	sc.close();
    }
}