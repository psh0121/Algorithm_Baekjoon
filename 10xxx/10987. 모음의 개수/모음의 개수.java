import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	String aeiou = "aeiou";
    	int cnt = 0;
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(aeiou.contains(Character.toString(str.charAt(i)))) cnt++;
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}