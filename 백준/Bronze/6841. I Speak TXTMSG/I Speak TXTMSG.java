import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("CU","see you");
		hashMap.put(":-)","I’m happy");
		hashMap.put(":-(","I’m unhappy");
		hashMap.put(";-)","wink");
		hashMap.put(":-P","stick out my tongue");
		hashMap.put("(~.~)","sleepy");
		hashMap.put("TA","totally awesome");
		hashMap.put("CCC","Canadian Computing Competition");
		hashMap.put("CUZ","because");
		hashMap.put("TY","thank-you");
		hashMap.put("YW","you’re welcome");
		hashMap.put("TTYL","talk to you later");
		
		Scanner sc = new Scanner(System.in);
		String val;
		
		while(sc.hasNext()) {
			val = sc.next();
			
			if(val.equals("TTYL")) {
				System.out.println(hashMap.get(val));
				break;
			}
			else if(hashMap.get(val) == null) {
				System.out.println(val);
			}
			else {
				System.out.println(hashMap.get(val));
			}
		}
	}
}         
