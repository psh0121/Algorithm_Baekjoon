import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] litera = {"a", "e", "i", "o", "s"};
		int[] cyfra = {4, 3, 1, 0, 5};
		
		String[] value = sc.next().split("");
		
		for(int i = 0; i < value.length; i++) {
			for(int j = 0; j < litera.length; j++) {
				if(value[i].equals(litera[j])) value[i] = Integer.toString(cyfra[j]);
			}
		}
		
		System.out.println(String.join("", value));
	}
}