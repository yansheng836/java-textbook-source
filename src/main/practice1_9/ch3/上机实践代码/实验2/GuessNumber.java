package ch3.�ϻ�ʵ������.ʵ��2;

public class GuessNumber {
	public static void main (String args[]) {
	      Scanner reader = new Scanner(System.in);
	      Random random = new Random();
	      System.out.println("����һ��1��100֮�������,��²������");
	      int realNumber = random.nextInt(100)+1;//random.nextInt(100)��[0,100)���������
	      int yourGuess = 0;
	      System.out.print("�������Ĳ²�:");  
	      yourGuess = reader.nextInt();
	      while(������1��) //ѭ������
	      {
	         if(������2��)   //�´��˵���������
	         {
	             System.out.print("�´���,��������Ĳ²�:");
	             yourGuess = reader.nextInt();
	         }
	         else if(������3��) //��С�˵���������
	         {
	             System.out.print("��С��,��������Ĳ²�:");
	             yourGuess = reader.nextInt();
	         }
	      }
	      System.out.println("�¶���!");
	   }
}
