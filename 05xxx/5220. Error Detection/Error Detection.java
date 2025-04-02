import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		String binaryStr = Integer.toBinaryString(sc.nextInt());
    		int checkBit = sc.nextInt();
    		int oneCnt = 0;
    		
    		for(int j = 0; j < binaryStr.length(); j++) {
    			if(binaryStr.charAt(j) == '1') oneCnt++;
    		}
    		
    		if(oneCnt % 2 == checkBit) System.out.println("Valid");
    		else System.out.println("Corrupt");
    	}
    	sc.close();
    }
}