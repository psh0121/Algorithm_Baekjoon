import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		String num = sc.next();	// 13자리 숫자 
    		
    		int sum = 0;
    		for(int j = 0; j < 13; j++) {	// 각자리숫자 더하기
    			int value = Integer.valueOf(Character.toString(num.charAt(j)));
    			sum += value;
    		}
    		
    		int gopTen = Integer.valueOf(num.substring(num.length() - 3)) * 10;// 3자리 추출해 10 곱하기  
    		int idKey = sum + gopTen;
    		String strIdKey = Integer.toString(idKey);
    		
    		if(idKey < 1000) System.out.println(idKey + 1000);
    		else System.out.println(strIdKey.substring(strIdKey.length() - 4));
    	}
    	
    	sc.close();
    }
}