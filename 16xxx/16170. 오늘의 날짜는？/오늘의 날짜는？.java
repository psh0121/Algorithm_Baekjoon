import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		
		ZonedDateTime curTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(curTime.getYear());
		System.out.println(curTime.getMonthValue());
		System.out.println(curTime.getDayOfMonth());
	}
}         
