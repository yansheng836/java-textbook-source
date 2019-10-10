package ch5.上机实践代码.实验1;

class Cat extends Animal {
	Cat() {
		name = "猫";
	}

	Cat(String s) {
		name = s;
	}

	// 【代码3】 //重写父类的cry方法，在命令行输出模拟狗叫的文字
	public void climbUpTree() {
		System.out.println(name + "会爬树");
	}
}
