import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String str = "SciComLove";
    	String strReverse = "evoLmoCicS";
    	
    	if(n % 2 == 1) System.out.println(strReverse);
    	else System.out.println(str);
    	 
    	sc.close();
    }
}