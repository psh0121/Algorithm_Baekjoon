import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int medal = sc.nextInt();
        int kid = sc.nextInt();
        
        System.out.println(medal % kid == 0 ? "Yes" : "No");
    }
}