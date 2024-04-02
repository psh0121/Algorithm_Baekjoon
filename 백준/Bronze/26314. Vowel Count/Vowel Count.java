import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	String aeiou = "aeiou";
    	
    	for(int i = 0; i < n; i++) {
    		String str = sc.next();
    		int aeiouCnt = 0;
    		
    		for(int j = 0; j < str.length(); j++) {
    			if(aeiou.contains(String.valueOf(str.charAt(j)))) {
    				aeiouCnt++;
    			}
    		}
    		
    		System.out.println(str);
    		if(aeiouCnt > (str.length() - aeiouCnt)) System.out.println(1);
    		else System.out.println(0);
    	}
    	sc.close();
    }
}