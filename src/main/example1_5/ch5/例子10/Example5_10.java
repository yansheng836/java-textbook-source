package ch5.例子10;

public class Example5_10 {
	public static void main(String args[]) {
		People10 people = null;
		American Johnson = new American();
		people = Johnson;      // people是Johnson对象的上转型对象。
		people.height = 187;    // 同于Johnson.height=187
		people.weight = 78.67;
		people.showBodyMess();  // 等同于Johnson调用重写的showBodyMess()方法
		// people.speakEnglish(); //非法,因为speakEnglish()是子类新增的方法
		people.mustDoingThing();
		
		Chinese zhang = new Chinese();
		people = zhang;      // people是zhang对象的上转型对象。
		people.height = 177;    // 同于zhang.height=187
		people.weight = 68.59;
		people.showBodyMess();  // 等同于Johnson调用重写的showBodyMess()方法
		// people.speakChinese(); //非法,因为speakChinese()是子类新增的方法
		people.mustDoingThing();
		// zhang = (Chinese)people;
		zhang.speakChinese();
	}
}
