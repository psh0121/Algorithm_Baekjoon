import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.next().split("-");
		String result = "";
		
		int number = Integer.parseInt(strArr[1] + strArr[2]);
		
		if(number >= 321 && number <= 419) result = "Aries";
		else if(number >= 420 && number <= 520) result = "Taurus";
		else if(number >= 521 && number <= 620) result = "Gemini";
		else if(number >= 621 && number <= 722) result = "Cancer";
		else if(number >= 723 && number <= 822) result = "Leo";
		else if(number >= 823 && number <= 922) result = "Virgo";
		else if(number >= 923 && number <= 1022) result = "Libra";
		else if(number >= 1023 && number <= 1122) result = "Scorpio";
		else if(number >= 1123 && number <= 1221) result = "Sagittarius";
		else if(number >= 120 && number <= 218) result = "Aquarius";
		else if(number >= 219 && number <= 320) result = "Pisces";
		else result = "Capricorn";
		
		System.out.println(result);
	}
}

