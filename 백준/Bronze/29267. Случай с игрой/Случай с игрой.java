import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 행동 수 
    	int k = sc.nextInt();	// 탄약 수 
    	
    	int save = 0;	// 저장 
    	int cur = 0;	// 현재 탄약 수  
    	
    	for(int i = 0; i < n; i++) {
    		String behavior = sc.next();
    		
    		if(behavior.equals("save")) {
    			save = cur;
    		}
    		else if(behavior.equals("load")) {
    			cur = save;
    		}
    		else if(behavior.equals("shoot")) {
    			cur--;
    		}
    		else if(behavior.equals("ammo")) {
    			cur = cur + k;
    		}
    		
    		System.out.println(cur);
    	}
    	
    	sc.close();
    }
}