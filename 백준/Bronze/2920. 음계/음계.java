import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String asc = "1 2 3 4 5 6 7 8";
		String desc = "8 7 6 5 4 3 2 1";

		String value = sc.nextLine();

		if(value.equals(asc)) System.out.println("ascending");
		else if(value.equals(desc)) System.out.println("descending");
		else System.out.println("mixed");
		sc.close();
    }
}
