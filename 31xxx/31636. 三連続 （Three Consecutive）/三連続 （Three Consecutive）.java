import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	String result = "No";
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String[] arr = sc.next().split("x");
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i].length() >= 3) {
    			result = "Yes";
    			break;
    		}
    	}
    	
    	System.out.println(result);
    	sc.close();
    }
}