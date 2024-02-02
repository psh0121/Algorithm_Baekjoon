import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		String gather = "aeiou";
		int no = 0;
		int yes = 0;
		
		for(int i = 0; i < str.length; i++) {
			if(gather.contains(str[i])) {
				no++;
				yes++;
			}
			else if("y".equals(str[i])) yes++;
		}
		
		System.out.println(no + " " + yes);
	}
}