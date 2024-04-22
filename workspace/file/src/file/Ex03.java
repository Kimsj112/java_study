package file;

import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException  {
//		2바이트(문자 단위)로 데이터 전송
		FileWriter fw = new FileWriter("test2.txt");
		
		fw.write('a');
		fw.close();
	}
}
