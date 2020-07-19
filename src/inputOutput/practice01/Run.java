//출제자: 김순기
//Bufferd를 사용하여 키보드로 입력을 받으시오.
//그리고 그내용을 출력하세요.

package inputOutput.practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(
				                new InputStreamReader(System.in))) {
			String content = br.readLine();
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
