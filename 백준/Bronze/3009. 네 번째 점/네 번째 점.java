import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[] xArr = new int[3];
        int[] yArr = new int[3];
        
        for(int i = 0; i < 3; i++) {
        	xArr[i] = sc.nextInt();
        	yArr[i] = sc.nextInt();
        }
        
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < xArr.length; i+= 2) {
        	int num = xArr[i];
        	int cnt = 0;
        	
        	for(int j = i; j < xArr.length; j++) {
        		if(xArr[j] == num) cnt++;
        	}
        	
        	if(cnt == 1) {
        		x = xArr[i];
        		break;
        	}
        }
        
        for(int i = 0; i < yArr.length; i+= 2) {
        	int num = yArr[i];
        	int cnt = 0;
        	
        	for(int j = i; j < yArr.length; j++) {
        		if(yArr[j] == num) cnt++;
        	}
        	
        	if(cnt == 1) {
        		y = yArr[i];
        		break;
        	}
        }
        
        System.out.println(x + " " + y);
    }
}