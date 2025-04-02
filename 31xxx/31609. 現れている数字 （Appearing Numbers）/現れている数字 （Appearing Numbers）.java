import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
        	if(i == 0) System.out.println(arr[i]);
        	else if(arr[i-1] == arr[i]) continue;
        	else System.out.println(arr[i]);
        }
    }
}