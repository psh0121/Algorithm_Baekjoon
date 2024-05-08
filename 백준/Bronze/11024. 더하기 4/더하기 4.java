import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = Integer.parseInt(sc.nextLine());
    	
    	for(int i = 0; i < t; i++) {
    		String[] arr = sc.nextLine().split(" ");
    		int sum = 0;
    		
    		for(int j = 0; j < arr.length; j++) {
    			sum += Integer.parseInt(arr[j]);
    		}
    		
    		System.out.println(sum);
    	}
    	
    	sc.close();
    }
}