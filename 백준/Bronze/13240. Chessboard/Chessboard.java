import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int row = sc.nextInt();
    	int col = sc.nextInt();
    	
    	// 한줄에 그려질 그림 그리기 
    	String colDesigin1 = "";
    	String colDesigin0 = "";
    	
    	colDesigin1 = "*.".repeat(col / 2);
    	colDesigin0 = ".*".repeat(col / 2);
    	
    	if(col % 2 == 1) {
    		colDesigin1 += "*";
    		colDesigin0 += ".";
    	}
    	
    	for(int i = 1; i <= row; i++) {
    		if(i % 2 == 1) System.out.println(colDesigin1);
    		else System.out.println(colDesigin0);
    	}
    	
    	sc.close();
    }
}