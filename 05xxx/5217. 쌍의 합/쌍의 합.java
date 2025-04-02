import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		System.out.print("Pairs for " + m + ": ");
    		int startNum = 1;
    		boolean isFirst = true;
    		
    		while(true) {
    			if(startNum == m-startNum) break;
    			if(startNum > m-startNum) break;
    			
    			if(isFirst) {
    				isFirst = false;
    				System.out.print(startNum + " " + (m-startNum));
    			}
    			else System.out.print(", " + startNum + " " + (m-startNum));
    			
    			startNum++;
    		}
    		System.out.println();
    	}
    	sc.close();
    }
}