import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minSum = Integer.MAX_VALUE;
        String result = "";
        
        for(int i = 1; i <= Math.ceil((double) n / 2); i++) {
        	int num = (int) Math.ceil((double) n / i);
        	if(num + i < minSum) {
        		result = i + " " + num;
        		minSum = num + i;
        	}
        }
        
        System.out.println(result);
    }
}