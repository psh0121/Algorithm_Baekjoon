import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		String[] valArr = val.split("");
		String result = "";
		
		for(int i = 0; i < valArr.length; i++) {
			if(valArr[i].toLowerCase() == valArr[i]) result += valArr[i].toUpperCase();
			else result += valArr[i].toLowerCase();
		}
		
		System.out.println(result);

	}

}