package ch14.�ϻ�ʵ��ģ�����.ʵ��;

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
			thread = new Thread(readNumber);   // �����ȡ��Ϣ���߳�
			System.out.print("�����������IP:");
			String IP = scanner.nextLine();
			System.out.print("����˿ں�:");
			int port = scanner.nextInt();
			if (mysocket.isConnected()) {
			} else {
				InetAddress address = InetAddress.getByName(IP);
				InetSocketAddress socketAddress = new InetSocketAddress(address, port);
				mysocket.connect(socketAddress);
				// InputStream in=������1�� //mysocket����getInputStream()����������
				// OutputStream out=������2��//mysocket����getOutputStream()���������
				inData = new DataInputStream(in);
				outData = new DataOutputStream(out);
				readNumber.setDataInputStream(inData);
				readNumber.setDataOutputStream(outData);
				thread.start();  // ���������ȡ��������߳�
			}
		} catch (Exception e) {
			System.out.println("�������ѶϿ�" + e);
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
				if (!str.startsWith("ѯ��")) {
					if (str.startsWith("�¶���"))
						continue;
					System.out.print("�õģ�������²�:");
					int myGuess = scanner.nextInt();
					String enter = scanner.nextLine(); // ���Ķ���Ļس�
					out.writeInt(myGuess);
				} else {
					System.out.print("�õģ�������Y��N:");
					String myAnswer = scanner.nextLine();
					out.writeUTF(myAnswer);
				}
			}
		} catch (Exception e) {
			System.out.println("��������ѶϿ�" + e);
			return;
		}
	}
}
