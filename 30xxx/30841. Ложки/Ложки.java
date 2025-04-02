import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        double make = sc.nextDouble();
        double color = sc.nextDouble();
        
        double day = (1/make) + (1/color);
        int spoon = 1;
        
        while(true) {
        	if(day * spoon > 1) break;
        	spoon++;
        }
        
        System.out.println(spoon - 1);
    }
}