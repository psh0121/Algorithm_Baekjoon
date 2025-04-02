import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int w = 1;
        int h = 1;
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 1) w++;
        	else h++;
        }
        
        System.out.println(w * h);
    }
}