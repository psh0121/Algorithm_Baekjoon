import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < n; i++) {
        	String[] arr = sc.nextLine().split("");
        	arr[0] = arr[0].toUpperCase();
        	
        	System.out.println(String.join("", arr));
        }
    }
}