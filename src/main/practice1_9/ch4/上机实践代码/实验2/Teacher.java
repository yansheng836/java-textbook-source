package ch4.上机实践代码.实验2;

public class Teacher {
	int teacherType;

	public void speak() {
		if (teacherType == 1) {
			System.out.println("课程的内容是二次方程");
		} else if (teacherType == 2) {
			System.out.println("课程的内容是学唱五线谱");
		}
	}
}
