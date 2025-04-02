import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.valueOf(sc.nextLine());
    	
    	for(int i = 0; i < n; i++) {
    		String[] arr = sc.nextLine().split(",");
    		int[] numArr = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1])};
    		
    		System.out.println(numArr[0] + numArr[1]);
    	}
    	
    	sc.close();
    }
}