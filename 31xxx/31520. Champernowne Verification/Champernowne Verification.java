import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split("");
        int[] arr = new int[strArr.length];
        for(int i = 0; i < arr.length; i++) arr[i] = Integer.valueOf(strArr[i]);
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != i + 1) {
        		System.out.println(-1);
        		return;
        	}
        }
        System.out.println(arr.length);
    }
}