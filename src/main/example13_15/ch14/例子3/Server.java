package ch14.����3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) {
		String[] answer = { "�����������", "����������", "���ӡ������ɳ��" };
		ServerSocket serverForClient = null;
		Socket socketOnServer = null;
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			serverForClient = new ServerSocket(2010);
		} catch (IOException e1) {
			System.out.println(e1);
		}
		try {
			System.out.println("�ȴ��ͻ�����");
			socketOnServer = serverForClient.accept(); // ����״̬�������пͻ�����
			out = new DataOutputStream(socketOnServer.getOutputStream());
			in = new DataInputStream(socketOnServer.getInputStream());
			for (int i = 0; i < answer.length; i++) {
				String s = in.readUTF(); // in��ȡ��Ϣ������״̬
				System.out.println("�������յ��ͻ�������:" + s);
				out.writeUTF(answer[i]);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("�ͻ��ѶϿ�" + e);
		}
	}
}
