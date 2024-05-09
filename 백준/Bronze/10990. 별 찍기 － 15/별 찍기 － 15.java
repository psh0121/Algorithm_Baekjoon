import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	String stars = "";
    	
    	int frontCnt = 0;
		int middleCnt = 2 * (num-1) + 1 - 2;
    	
    	for(int i = num; i > 0; i--) {
    		if(i == 1) {
    			stars = " ".repeat(frontCnt) + "*\n" + stars;
    			break;
    		}
    		
    		stars = " ".repeat(frontCnt) + "*" + " ".repeat(middleCnt) + "*\n" + stars;
    		
    		frontCnt++;
    		middleCnt = middleCnt - 2;
    	}
    	
    	System.out.println(stars);
    	
    	sc.close();
    }
}