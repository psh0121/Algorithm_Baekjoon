import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String aeiou = "aeiou";
    	
    	for(int i = 0; i < n; i++) {
    		String str = sc.next();
    		int cnt = 0;
    		
    		for(int j = 0; j < str.length(); j++) {
    			if(aeiou.contains(Character.toString(str.charAt(j)))) cnt++;
    		}
    		
    		System.out.println(str);
    		
    		if(str.length()-cnt >= cnt) System.out.println(0);
    		else System.out.println(1);
    	}
    	
    	sc.close();
    }
}