import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        boolean[] arr = new boolean[strArr.length];
        for(int i = 0; i < arr.length; i++) {
        	if(strArr[i].equals("1")) arr[i] = true;
        	else arr[i] = false;
        }
        
        boolean res = false;
        for(int i = 0; i < 10; i++) {
        	for(int j = i + 1; j < 10; j++) {
        		res ^= (arr[i] || arr[j]);
        		for(int k = j + 1; k < 10; k++) {
        			res ^= (arr[i] || arr[j] || arr[k]);
        		}
        	}
        }
        
        System.out.println(res ? 1 : 0);
    }
}