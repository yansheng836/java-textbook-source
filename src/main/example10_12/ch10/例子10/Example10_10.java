package ch10.例子10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class Example10_10 {
	public static void main(String args[]) {
		try {
			ByteArrayOutputStream outByte = new ByteArrayOutputStream();
			byte[] byteContent = "国庆60周年".getBytes();
			outByte.write(byteContent);
			ByteArrayInputStream inByte = new ByteArrayInputStream(outByte.toByteArray());
			byte backByte[] = new byte[outByte.toByteArray().length];
			inByte.read(backByte);
			System.out.println(new String(backByte));
			CharArrayWriter outChar = new CharArrayWriter();
			char[] charContent = "中秋快乐".toCharArray();
			outChar.write(charContent);
			CharArrayReader inChar = new CharArrayReader(outChar.toCharArray());
			char backChar[] = new char[outChar.toCharArray().length];
			inChar.read(backChar);
			System.out.println(new String(backChar));
		} catch (IOException exp) {
		}
	}
}
