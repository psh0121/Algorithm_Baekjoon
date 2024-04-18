import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String[] str = sc.next().split("");
    	int cnt = 0;
    	
    	for(int i = 0; i < str.length; i++) {
    		System.out.print(str[i]);
    		cnt++;
    		
    		if(cnt == 10) {
    			System.out.println();
    			cnt = 0;
    		}
    	}
    	
    	sc.close();
    }
}