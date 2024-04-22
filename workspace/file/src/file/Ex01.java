package file;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
//		절대 경로 : 내가 어디에 위치해 있든 무조건 루트부터 작성하는 풀 경로
//		상대 경로 : 내가 있는 위치를 기준으로 작성하는 경로 -> ..(이전경로 의미), .(현재경로 의미)
		
		File f = new File("../../test.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
