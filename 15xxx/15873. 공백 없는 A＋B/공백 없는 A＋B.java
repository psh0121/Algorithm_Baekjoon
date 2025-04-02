import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		
		int result = 0;
		String num = "";
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i].equals("0")) {
				num  = "0" + num;
			}
			else {
				num = arr[i] + num;
				result += Integer.parseInt(num);
				
				num = "";
			}
		}
		
		System.out.println(result);
	}
}         
