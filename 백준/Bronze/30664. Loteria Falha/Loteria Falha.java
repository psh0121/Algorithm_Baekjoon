import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = "";
		String val = "";
		
		while(sc.hasNext()) {
			num = sc.next();
            val = "";
            
            if(num.equals("0")) break;
            
			for(int i = 0; i < num.length(); i++) {
				val += num.charAt(i);
				val = "" + (Integer.parseInt(val) % 42);
			}
			
			if(val.equals("0")) System.out.println("PREMIADO");
			else System.out.println("TENTE NOVAMENTE");
		}
	}
}         
