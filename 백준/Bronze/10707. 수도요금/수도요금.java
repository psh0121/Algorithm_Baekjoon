import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	int totalUse = sc.nextInt();
    	
    	int xFee = a * totalUse;
    	int yFee = b;
    	
    	if((totalUse - c) > 0) yFee += (d * (totalUse - c));
    	
    	System.out.println(Math.min(xFee, yFee));
    	
    	
    	sc.close();
    }
}