import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double result = 0;
        
        if(m <= 30) result += m / 2;
        else {
        	result = 15;
        	m -= 30;
        	
        	result += m * 1.5;
        }
        
        System.out.println(result);
    }
}