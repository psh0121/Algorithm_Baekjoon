import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		if(a == 0 && b == 0 && c == 0) break;
    		
    		int[] sides = {a, b, c};
    		Arrays.sort(sides);
    		
    		int max = sides[2];
    		int sum = sides[0] + sides[1];	// 두 변의 길이 합 
    		
    		if(max < sum) {
    			if(a == b && b == c) System.out.println("Equilateral");
    			else if(a == b || b == c || c == a) System.out.println("Isosceles");
    			else System.out.println("Scalene");
    		}
    		else System.out.println("Invalid");
    	}
    	sc.close();
    }
}