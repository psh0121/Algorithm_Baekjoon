import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	
    	StringBuffer sb = new StringBuffer(str);
    	String rverseStr = sb.reverse().toString();
    	
    	System.out.println(str.equals(rverseStr) ? 1 : 0);
    	
    	sc.close();
    }
}