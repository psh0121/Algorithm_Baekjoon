import java.util.Scanner;

public class Main {
	
	public static String getGrade(int score) {
		String result = "";
		
		if(score >= 97 && score <= 100) result = "A+";
		else if(score >= 90 && score <= 96) result = "A";
		else if(score >= 87 && score <= 89) result = "B+";
		else if(score >= 80 && score <= 86) result = "B";
		else if(score >= 77 && score <= 79) result = "C+";
		else if(score >= 70 && score <= 76) result = "C";
		else if(score >= 67 && score <= 69) result = "D+";
		else if(score >= 60 && score <= 66) result = "D";
		else result = "F";
		
		return result;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 호빗 수 
    	
    	for(int i = 0; i < n; i++) {
    		String name = sc.next();
    		String grade = getGrade(sc.nextInt());
    		
    		System.out.println(name + " " + grade);
    	}
    	
    	sc.close();
    }
}