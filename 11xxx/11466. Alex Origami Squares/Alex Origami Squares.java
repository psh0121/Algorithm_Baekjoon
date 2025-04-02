import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	
    	// 1. 한행에 정사각형 3개 
    	double case1 = Math.min((double) w/3, (double) h);
    	
    	double case2 = Math.min((double) h/3, (double) w);
    	
    	// 2. 두행에 걸쳐 정사각형 3개 
    	double case3 = Math.min((double) w/2, (double) h / 2);
    	
    	double maxValue = Math.max(case1, case2);
    	maxValue = Math.max(maxValue, case3);
    	
    	System.out.printf("%.3f", maxValue);
    	
    	sc.close();
    }
}