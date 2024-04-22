package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("test3.txt"));
		
		bw.write("수정했다!!");
		
//		버퍼를 비운다. -> 버퍼에 있는 데이터를 전송한다.
//		bw.flush();
		
//		close()하면 flush()가 자동으로 됨.
		bw.close();
		
		BufferedWriter br = new BufferedWriter(new FileWriter("test3.txt"));
		System.out.println(br);
		
		br.close();
	}
}
