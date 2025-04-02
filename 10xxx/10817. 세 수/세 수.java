import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String[] arr = sc.nextLine().split(" ");
    	int[] numArr = new int[arr.length];
    	for(int i = 0; i < numArr.length; i++) numArr[i] = Integer.valueOf(arr[i]);
    	
    	Arrays.sort(numArr);
    	
    	System.out.println(numArr[1]);
    	
    	sc.close();
    }
}