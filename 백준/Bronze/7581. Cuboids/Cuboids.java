import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int l = sc.nextInt();
    		int w = sc.nextInt();
    		int h = sc.nextInt();
    		int v = sc.nextInt();
    		
    		if(l == 0 && w == 0 && h == 0 && v == 0) break;
    		
    		if(l == 0) l = v / w / h; 
    		else if(w == 0) w = v / l / h;
    		else if(h == 0) h = v / l / w;
    		else if(v == 0) v = l * w * h;	
    		
    		System.out.println(l + " " + w + " " + h + " " + v);
    	}
    			
    	sc.close();
    }
}