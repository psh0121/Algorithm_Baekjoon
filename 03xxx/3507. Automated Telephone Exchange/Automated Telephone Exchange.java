import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        
        if(n <= 198) {
        	result = 99 - (n - 99) + 1;
        }
        
        System.out.println(result);
    }
}