import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		String slogan = sc.next();
		
		if(slogan.equals("SONGDO")) System.out.println("HIGHSCHOOL");
		else if(slogan.equals("CODE")) System.out.println("MASTER");
		else if(slogan.equals("2023")) System.out.println("0611");
		else System.out.println("CONTEST");
	}
}         
