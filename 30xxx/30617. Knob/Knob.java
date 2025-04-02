import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int l = 0;
		int r = 0;

		int amount = 0;

		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int curL = Integer.parseInt(st.nextToken());
			int curR = Integer.parseInt(st.nextToken());

			// lr이 같은 방향일 경우 
			if(curL == curR && curL != 0) amount++;

			if(i == 1) {
				l = curL;
				r = curR;
				continue;
			}

			// 이전 방향과 같과 같을경우
			if(curL != 0 && l == curL) amount++;
			if(curR != 0 && r == curR) amount++;

			l = curL;
			r = curR;
		}

		bw.write(Integer.toString(amount));
		
		br.close();
		bw.close();
    }
}