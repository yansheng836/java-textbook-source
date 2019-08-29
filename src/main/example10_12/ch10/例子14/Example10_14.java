package ch10.例子14;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Scanner;

public class Example10_14 {
	public static void main(String args[]) {
		File file = new File("Example10_14.java");
		Scanner scanner = new Scanner(System.in);
		try {
			RandomAccessFile input = new RandomAccessFile(file, "rw");
			FileChannel channel = input.getChannel();
			FileLock lock = channel.tryLock(); // 加锁
			System.out.println("输入要读去的行数:");
			while (scanner.hasNextInt()) {
				int m = scanner.nextInt();
				lock.release();                // 解锁
				for (int i = 1; i <= m; i++) {
					String str = input.readLine();
					System.out.println(str);
				}
				lock = channel.tryLock(); // 加锁
				System.out.println("输入要读去的行数:");
			}
		} catch (IOException event) {
			System.out.println(event);
		}
	}
}
