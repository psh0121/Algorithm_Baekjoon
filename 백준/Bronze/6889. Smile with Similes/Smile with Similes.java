import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	String[] arr1 = new String[n];
    	String[] arr2 = new String[m];
    	
    	for(int i = 0; i < n; i++) arr1[i] = sc.next();
    	for(int j = 0; j < m; j++) arr2[j] = sc.next();
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < m; j++) {
    			System.out.println(arr1[i] + " as " + arr2[j]);
    		}
    	}
    	sc.close();
    }
}