import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int hp = sc.nextInt();
    		int mp = sc.nextInt();
    		int at = sc.nextInt();
    		int pt = sc.nextInt();
    		
    		hp += sc.nextInt();
    		mp += sc.nextInt();
    		at += sc.nextInt();
    		pt += sc.nextInt();
    		
    		if(hp < 1) hp = 1;
    		if(mp < 1) mp = 1;
    		if(at < 0) at = 0;
    		
    		System.out.println(hp + (mp*5) + (at*2) + (pt*2));
    	}
    	
    	sc.close();
    }
}