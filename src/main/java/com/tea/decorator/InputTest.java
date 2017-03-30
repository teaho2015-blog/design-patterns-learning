package com.tea.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in =
					new LowerCaseInputStream(
						new BufferedInputStream(
							new FileInputStream(InputTest.class.getResource("/decorator/test.txt").getPath())));

			byte[] bytes = new byte[1024];
			while((c = in.read(bytes)) >= 0) {
				System.out.print(new String(bytes));
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
