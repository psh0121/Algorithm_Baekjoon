import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String reCode = sc.next();	// 재수강할 과목
    	String front5ReCode = reCode.substring(0, 5);	// reCode에서 앞 5자리 자름 
    	int n = sc.nextInt();	// 수강 신청 가능한 과목 수
    	
    	int cnt = 0;	// 재수강 인정 과목 
    	
    	for(int i = 0; i < n; i++) {
    		String code = sc.next();
    		String front5Code = code.substring(0, 5);
    		
    		if(front5ReCode.equals(front5Code)) cnt++;
    	}
    	
    	System.out.println(cnt);
    	sc.close();
    }
}