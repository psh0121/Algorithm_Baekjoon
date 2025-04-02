import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		String result = "molu";
		
		if(value.equals("fdsajkl;")) result = "in-out";
		else if(value.equals("jkl;fdsa")) result = "in-out";
		else if(value.equals("asdf;lkj")) result = "out-in";
		else if(value.equals(";lkjasdf")) result = "out-in";
		else if(value.equals(";lkjasdf")) result = "out-in";
		else if(value.equals("asdfjkl;")) result = "stairs";
		else if(value.equals(";lkjfdsa")) result = "reverse";
		
		System.out.println(result);
	}
}