import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String[] str = new String[n];
    	
    	for(int i = 0; i < n; i++) {
    		str[i] = Character.toString(sc.next().charAt(0));
    	}
    	
    	// 중복제거 
    	HashSet<String> hashSet = new HashSet<>(Arrays.asList(str));
    	String[] reduceArr = hashSet.toArray(new String[0]);
    	Arrays.sort(reduceArr);
    	
    	int startNum = 65;
    	int beforeNum = 0;
    	
    	int curCnt = 0;
    	int maxCnt = 0;
    	
    	for(int i = 0; i < reduceArr.length; i++) {
    		char value = reduceArr[i].charAt(0);
    		
    		if((int)value == startNum) {
    			beforeNum = 65;
    			curCnt = 1;
    		}
    		else if((int)value - beforeNum == 1) {
    			beforeNum = (int)value;
    			curCnt++;
    		}
    		else {
    			beforeNum = 0;
    			curCnt = 0;
    		}
    		
    		maxCnt = Math.max(maxCnt, curCnt);
    	}
    	
    	System.out.println(maxCnt);
    	sc.close();
    }
}