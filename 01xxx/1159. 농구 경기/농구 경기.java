import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 첫글자, 횟수 Map에 저장
		Map<Character, Integer> letterCnt = new HashMap<>();

		// 입력된 성의 첫글자와 수량 처리
		for(int i = 0; i < n; i++) {
			String lastName = br.readLine();
			char firestLetter = lastName.charAt(0);
			letterCnt.put(firestLetter, letterCnt.getOrDefault(firestLetter, 0) + 1);
		}

		// 5번 이상 등장 첫글자 List에 모으기
		List<Character> fiveOverLetter = new ArrayList<>();

		for(Entry<Character, Integer> entry : letterCnt.entrySet()) {
			if (entry.getValue() >= 5) {
				fiveOverLetter.add(entry.getKey());
			}
		}

		// 결과 출력
		if(fiveOverLetter.isEmpty()) System.out.println("PREDAJA");
		else {
			Collections.sort(fiveOverLetter);
			for(char letter : fiveOverLetter) {
				System.out.print(letter);
			}
		}
    }
}
