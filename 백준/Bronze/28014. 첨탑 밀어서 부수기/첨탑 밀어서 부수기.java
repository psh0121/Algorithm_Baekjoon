import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st1.nextToken());
		int curTower = Integer.parseInt(st2.nextToken());
		int pushCnt = 1;

		for(int i = 1; i < n; i++) {
			int nextTower = Integer.parseInt(st2.nextToken());

			if(curTower <= nextTower) pushCnt++;
			
			curTower = nextTower;
		}

		System.out.println(pushCnt);
		br.close();
    }
}