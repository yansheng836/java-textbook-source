package ch4.上机实践代码.实验2;

public class MainClass {
	public static void main(String args[]) {
		// 【代码1】//用Teacher类声明名字是zhang和wang的对象
		// 【代码2】 //创建 zhang
		wang = new Teacher();
		zhang.teacherType = 1;
		wang.teacherType = 2;
		School 实验中学 = new School();
		// 【代码3】//实验中学调用setTeacher(Teacher t1,Teacher t2)方法将zhang和wang值传递给参数t1和t2。
		实验中学.startMathLesson();
		实验中学.startMusicLesson();
	}
}
