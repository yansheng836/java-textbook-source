package ch8.例子3;

interface SpeakHello {
	void speak();
}

class HelloMachine {
	public void turnOn(SpeakHello hello) {
		hello.speak();
	}
}

public class Example8_3 {
	public static void main(String args[]) {
		HelloMachine machine = new HelloMachine();
		machine.turnOn(new SpeakHello() {
			public void speak() {
				System.out.println("hello,you are welcome!");
			}
		});
		machine.turnOn(new SpeakHello() {
			public void speak() {
				System.out.println("你好，欢迎光临!");
			}
		});
	}
}
