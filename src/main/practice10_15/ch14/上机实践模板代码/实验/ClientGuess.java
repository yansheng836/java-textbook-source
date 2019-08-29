package ch14.上机实践模板代码.实验;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientGuess {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Socket mysocket = null;
		DataInputStream inData = null;
		DataOutputStream outData = null;
		Thread thread;
		ReadNumber readNumber = null;
		try {
			mysocket = new Socket();
			readNumber = new ReadNumber();
			thread = new Thread(readNumber);   // 负责读取信息的线程
			System.out.print("输入服务器的IP:");
			String IP = scanner.nextLine();
			System.out.print("输入端口号:");
			int port = scanner.nextInt();
			if (mysocket.isConnected()) {
			} else {
				InetAddress address = InetAddress.getByName(IP);
				InetSocketAddress socketAddress = new InetSocketAddress(address, port);
				mysocket.connect(socketAddress);
				// InputStream in=【代码1】 //mysocket调用getInputStream()返回输入流
				// OutputStream out=【代码2】//mysocket调用getOutputStream()返回输出流
				inData = new DataInputStream(in);
				outData = new DataOutputStream(out);
				readNumber.setDataInputStream(inData);
				readNumber.setDataOutputStream(outData);
				thread.start();  // 启动负责读取随机数的线程
			}
		} catch (Exception e) {
			System.out.println("服务器已断开" + e);
		}
	}
}

class ReadNumber implements Runnable {
	Scanner scanner = new Scanner(System.in);
	DataInputStream in;
	DataOutputStream out;

	public void setDataInputStream(DataInputStream in) {
		this.in = in;
	}

	public void setDataOutputStream(DataOutputStream out) {
		this.out = out;
	}

	public void run() {
		try {
			out.writeUTF("Y");
			while (true) {
				String str = in.readUTF();
				System.out.println(str);
				if (!str.startsWith("询问")) {
					if (str.startsWith("猜对了"))
						continue;
					System.out.print("好的，我输入猜测:");
					int myGuess = scanner.nextInt();
					String enter = scanner.nextLine(); // 消耗多余的回车
					out.writeInt(myGuess);
				} else {
					System.out.print("好的，我输入Y或N:");
					String myAnswer = scanner.nextLine();
					out.writeUTF(myAnswer);
				}
			}
		} catch (Exception e) {
			System.out.println("与服务器已断开" + e);
			return;
		}
	}
}