import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int col = sc.nextInt();
        	int row = sc.nextInt();
        	if(col == 0 && row == 0) break;
        	
        	int[][] arr = new int[row][col];
        	
        	for(int i = 0; i < row; i++) {
        		for(int j = 0; j < col; j++) {
        			arr[i][j] = sc.nextInt();
        		}
        	}
        	
        	boolean isTrue = true;
        	
        	for(int i = 0; i < col; i++) {
        		isTrue = true;
        		for(int j = 0; j < row; j++) {
        			if(arr[j][i] == 0) {
        				isTrue = false;
        				break;
        			}
        		}
        		
        		if(isTrue) {
        			System.out.println("yes");
        			break;
        		}
        	}
        	
        	if(!isTrue) System.out.println("no");
    	}
    	sc.close();
    }
}