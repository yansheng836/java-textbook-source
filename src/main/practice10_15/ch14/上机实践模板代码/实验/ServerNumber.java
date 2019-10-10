package ch14.上机实践模板代码.实验;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerNumber {
	public static void main(String args[]) {
	      ServerSocket server=null;
	      ServerThread thread;
	      Socket you=null;
	      while(true) { 
//	          try{  server= 【代码3】//创建在端口4331上负责监听的 ServerSocket对象
	          }
	          catch(IOException e1) {
	             System.out.println("正在监听");   
	          } 
//	          try{  you=  【代码4】 // server调用accept()返回和客户端相连接的Socket对象
	                System.out.println("客户的地址:"+you.getInetAddress());
	          }
	          catch (IOException e) {
	                System.out.println("正在等待客户");
	          }
	          if(you!=null) {
	                new ServerThread(you).start();  
	          }
	      }
	   }
}

class ServerThread extends Thread {
	Socket socket;
	DataInputStream in = null;
	DataOutputStream out = null;

	ServerThread(Socket t) {
		socket = t;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
		}
	}

	public void run() {
		try {
			while (true) {
				String str = in.readUTF();
				boolean boo = str.startsWith("Y") || str.startsWith("y");
				if (boo) {
					out.writeUTF("给你一个1至100之间的随机数,请猜它是多少呀!");
					Random random = new Random();
					int realNumber = random.nextInt(100) + 1;
					handleClientGuess(realNumber);
					out.writeUTF("询问:想继续玩输入Y，否则输入N:");
				} else {
					return;
				}
			}
		} catch (Exception exp) {
		}
	}

	public void handleClientGuess(int realNumber) {
		while (true) {
			try {
				int clientGuess = in.readInt();
				System.out.println(clientGuess);
				if (clientGuess > realNumber)
					out.writeUTF("猜大了");
				else if (clientGuess < realNumber)
					out.writeUTF("猜小了");
				else if (clientGuess == realNumber) {
					out.writeUTF("猜对了！");
					break;
				}
			} catch (IOException e) {
				System.out.println("客户离开");
				return;
			}
		}
	}
}
