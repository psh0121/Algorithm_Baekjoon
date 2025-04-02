import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] arr = sc.nextLine().split(" ");
    	
    	int cnt = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i].contains("-")) continue;
    		else if(arr[i].equals("0")) continue;
    		
    		cnt++;
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}