package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
		
//		1. 줄 바꿈 처리는 \n을 사용함.
		bw.write("안녕하세요!");
		
//		2. newLine()을 사용함.
		bw.newLine();
		
		bw.close();
		
		System.out.println("완료!");
	}
}
