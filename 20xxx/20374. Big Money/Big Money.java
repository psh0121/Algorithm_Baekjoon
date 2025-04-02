import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BigDecimal total = BigDecimal.ZERO;
    	
    	String value;
    	
    	while((value = br.readLine()) != null) {
    		BigDecimal a = new BigDecimal(value);
    		total = total.add(a);
    	}
    	
    	System.out.println(total);
    	br.close();
    }
}