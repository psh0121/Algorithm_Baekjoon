import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        
        String str = sc.next();
        String result = "";
        
        for(int i = 0; i < 3; i++) {
        	char value = str.charAt(i);
        	
        	switch(value) {
        	case 'A':
        		result += a + " ";
        		break;
        	case 'B':
        		result += b + " ";
        		break;
        	default:
        		result += c + " ";
        		break;
        	}
        }
        
        System.out.println(result);
    }
}