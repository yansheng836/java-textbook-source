package ch5.����10;

public class Example5_10 {
	public static void main(String args[]) {
		People10 people = null;
		American Johnson = new American();
		people = Johnson;      // people��Johnson�������ת�Ͷ���
		people.height = 187;    // ͬ��Johnson.height=187
		people.weight = 78.67;
		people.showBodyMess();  // ��ͬ��Johnson������д��showBodyMess()����
		// people.speakEnglish(); //�Ƿ�,��ΪspeakEnglish()�����������ķ���
		people.mustDoingThing();
		
		Chinese zhang = new Chinese();
		people = zhang;      // people��zhang�������ת�Ͷ���
		people.height = 177;    // ͬ��zhang.height=187
		people.weight = 68.59;
		people.showBodyMess();  // ��ͬ��Johnson������д��showBodyMess()����
		// people.speakChinese(); //�Ƿ�,��ΪspeakChinese()�����������ķ���
		people.mustDoingThing();
		// zhang = (Chinese)people;
		zhang.speakChinese();
	}
}
