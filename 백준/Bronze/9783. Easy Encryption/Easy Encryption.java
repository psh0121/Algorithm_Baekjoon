import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String result = "";
    	
    	// 아스키 넘버에 소문자는 -96, 대문자에는 -38을 빼준다 
    	for(int i = 0; i < str.length(); i++) {
    		char s = str.charAt(i);
    		int changeS = 0;
    		
    		char upperS = Character.toString(s).toUpperCase().charAt(0);
    		char lowerS = Character.toString(s).toLowerCase().charAt(0);
    		
    		// 빈칸
    		if((int)s == 32) {
    			result += " ";
    		}
    		// 숫자형태
    		else if((int)s >= 48 && (int)s <= 57) {
    			result += "#" + s;
    		}
    		// 특수문자
    		else if(!Character.toString(s).matches("[0-9|a-z|A-Z]*")){
    			result += s;
    		}
    		// 대문자 (-38)
    		else if(s == upperS) {
    			changeS = (int)s - 38;
    			result += changeS;
    		}
    		// 소문자 (-96) 
    		else if(s == lowerS) {
    			changeS = (int)s - 96;
    			
    			if(changeS < 10) result += "0" + changeS;
    			else result += changeS;
    		}
    	}
    	
    	System.out.println(result);
    	sc.close();
    }
}