import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int k = sc.nextInt();	// data set의 개수 
    	
    	for(int i = 1; i <= k; i++) {
    		int h = sc.nextInt();	// 히드라 머리개수 
    		String data = sc.next();
    		
    		for(int j = 0; j < data.length(); j++) {
    			char attack = data.charAt(j);
    			
    			if(attack == 'c') h = h - 1 + 2;	// 머리 하나 컷팅후 바로 2개 생겨버리기 
    			else h = h - 1;
    			
    			// 만약 더이상 자를 머리가 없다면 종료 
    			if(h == 0) break;
    		}
    		
    		System.out.printf("Data Set %d:\n", i);
    		System.out.println(h);
    		System.out.println();
    	}
    	
    	sc.close();
    }
}