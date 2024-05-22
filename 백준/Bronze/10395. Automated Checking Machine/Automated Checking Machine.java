import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] arr1 = new int[5];
    	int[] arr2 = new int[5];
    	
    	for(int i = 0; i < arr1.length; i++) {
    		arr1[i] = sc.nextInt();
    	}
    	for(int i = 0; i < arr2.length; i++) {
    		arr2[i] = sc.nextInt();
    	}
    	
    	for(int i = 0; i < 5; i++) {
    		if(arr1[i] == arr2[i]) {
    			System.out.println("N");
    			return;
    		}
    	}
    	
    	System.out.println("Y");
    	sc.close();
    }
}