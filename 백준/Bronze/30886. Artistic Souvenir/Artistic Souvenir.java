import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double r = Math.sqrt(n / Math.PI);
        double value = 2 * r + 2;	// 여백까지 포함한 지름길이
        
        
        System.out.println(value * value);
    }
}