import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String str = sc.next();
    	
    	if(str.contains("I")) System.out.print(1 + " ");
		if(str.contains("II")) System.out.print(2 + " ");
		if(str.contains("III")) System.out.print(3 + " ");
		if(str.contains("IV")) System.out.print(4 + " ");
		if(str.contains("V")) System.out.print(5 + " ");
		if(str.contains("VI")) System.out.print(6 + " ");
		if(str.contains("VII")) System.out.print(7 + " ");
		if(str.contains("VIII")) System.out.print(8 + " ");
		if(str.contains("IX")) System.out.print(9 + " ");
		if(str.contains("X")) System.out.print(10 + " ");
		if(str.contains("XI")) System.out.print(11 + " ");
		if(str.contains("XII")) System.out.print(12 + " ");
    	
    	sc.close();
    }
}