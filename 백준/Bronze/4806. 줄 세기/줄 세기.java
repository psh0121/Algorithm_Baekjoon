import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int line = 0;
    	
    	while(sc.hasNextLine()) {
    		String input = sc.nextLine();
    		
    		if(input.isEmpty()) break;
    		
    		line++;
    	}
    	System.out.println(line);
    	sc.close();
    }
}