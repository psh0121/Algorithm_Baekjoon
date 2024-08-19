import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 주어진 환경 변화들이 바다 면적이 최소 9%, 
		// 산소 함유량이 최소 14%, 
		// 그리고 기온이 섭씨 +8도 이상을 달성하면 'liveable'을 출력합니다. 
		// 그렇지 않으면 'not liveable'을 출력합니다.
		String[] numValueArr = {"+0", "+1", "+2", "+3", "+4", "+5"};
		int ocean = 0;
		int oxygen = 0;
		int temperature = -30;

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String value = sc.next();
			String numValue = sc.next();

			int num = 0;
			for(int j = 0; j < numValueArr.length; j++) {
				if(numValue.equals(numValueArr[j])) {
					num = j;
					break;
				}
			}

			if(value.equals("ocean")) ocean += num;
			else if(value.equals("oxygen")) oxygen += num;
			else temperature += num;
		}

		if(ocean >= 9 && oxygen >= 14 && temperature >= 8) {
			System.out.println("liveable");
		}
		else System.out.println("not liveable");

		sc.close();
    }
}
