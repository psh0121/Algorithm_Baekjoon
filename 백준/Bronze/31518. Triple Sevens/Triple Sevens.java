import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sevenCnt = 0;
        
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < n; j++) {
        		if(sc.nextInt() == 7) {
        			sevenCnt++;
        		}
        	}
        }
        
        System.out.println(sevenCnt == 3 ? 777 : 0);
    }
}