package ch4.�ϻ�ʵ������.ʵ��2;

public class MainClass {
	public static void main(String args[]) {
		// ������1��//��Teacher������������zhang��wang�Ķ���
		// ������2�� //���� zhang
		wang = new Teacher();
		zhang.teacherType = 1;
		wang.teacherType = 2;
		School ʵ����ѧ = new School();
		// ������3��//ʵ����ѧ����setTeacher(Teacher t1,Teacher t2)������zhang��wangֵ���ݸ�����t1��t2��
		ʵ����ѧ.startMathLesson();
		ʵ����ѧ.startMusicLesson();
	}
}
