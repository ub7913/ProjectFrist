package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) {
		//FileInputStream fis = null;
		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try (FileInputStream fis = new FileInputStream(paths)) {
			//fis = new FileInputStream(paths);
			int readByte;
			while((readByte = fis.read()) != -1) {//fis.read()를 readByte계속 읽는데 -1이 아니때까지
				System.out.write(readByte); //읽어와서 적어 내는것
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다");
		}
//		try {
//			fis.close();//예외가 발생하는 시점에 close하겠다는 것
//		} catch (IOException e) {
//			e.printStackTrace();
//		} --->>>>메인 안의 try안에서 FileInputStream fis = null; 와 fis = new FileInputStream(paths);를 합해주면 close가 필요 없다
	}//end of main()

}
