import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		int l = sc.nextInt();
    		int w = sc.nextInt();
    		int a = sc.nextInt();
    		
    		if(l == 0 && w == 0 && a == 0) break;
    		
    		if(l == 0) l = a / w;
    		else if(w == 0) w = a / l;
    		else a = l * w;
    		
    		System.out.println(l + " " + w + " " + a);
    	}
    	sc.close();
    }
}