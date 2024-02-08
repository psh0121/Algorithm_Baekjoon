import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] result = new String[10][20];
        
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 20; j++) result[i][j] = ".";
        }
        
        for(int i = 0; i < n; i++) {
        	String seat = sc.next();
        	
        	result[(int)seat.charAt(0)-65][Integer.parseInt(seat.substring(1)) - 1] = "o";
        }
        
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 20; j++) {
        		System.out.print(result[i][j]);
        	}
        	System.out.println();
        }
    }
}