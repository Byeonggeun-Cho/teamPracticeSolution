//출제자: 김인서
//		<<입출력>>
//		목표 : 텍스트 파일을 만들어  내용을 저장하고, 파일을 확인해보자.
//		요구 : 파일 입출력을 다시 한 번 익히자. 예외처리도 사용하자.
//		출력 예시 : 
//			1)mini.txt 파일을 생성한다.
//			2)(되도록) Buffered를 사용하여 다음의 스크립트를 파일에 저장하자
//				-하늘은 파랗고 지구는 푸르다

package inputOutput.practice02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {

	public static void main(String[] args) {
		File file = new File("mini.txt");
		
		
		String str = "하늘은 파랗고 지구는 푸르다";
		
		try(BufferedWriter bw = new BufferedWriter(
								new FileWriter(file) )) {
			bw.write(str);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
