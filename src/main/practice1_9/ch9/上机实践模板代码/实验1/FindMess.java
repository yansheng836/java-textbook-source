package ch9.�ϻ�ʵ��ģ�����.ʵ��1;

public class FindMess {
	public static void main(String args[]) {
	      String mess = "����:���� ����ʱ��:1989.10.16��������վ:http://www.zhang.com��"+
	"���:185 cm,����:72 kg";
	      int index =������1��  //mess����indexOf(String s)���������ַ������״γ���ð�ŵ�λ��
	      String name = mess.substring(index+1);
	      if(name.startsWith("��")) {
	          System.out.println("�����е�������\"��\"");
	      }
	      index=������2��//mess����indexOf(String s,int start)�����ַ����е�2�γ���ð�ŵ�λ��
	      String date = mess.substring(index+1,index+11);
	      System.out.println(date);
	      index = mess.indexOf(":",index+1);
	      int heightPosition=������3��//mess����indexOf(String s)�����״γ���"���"��λ��
	      String personNet = mess.substring(index+1,heightPosition-1);
	      System.out.println(personNet);
	      index =������4��//mess����indexOf(String s,int start)�����ַ�����"���"�����ð��λ��
	      int cmPosition = mess.indexOf("cm");
	      String height = mess.substring(index+1,cmPosition);
	      height = height.trim();
	      int h = Integer.parseInt(height);
	      if(h>=180) {
	         System.out.println("�����е����"+height+"���ڻ����180 cm");
	      }  
	      else {
	         System.out.println("�����е����"+height+"С��180 cm");
	      }
	      index=������5��//mess����lastIndexOf(String s)�����ַ��������һ��ð��λ��
	      int kgPosition = mess.indexOf("kg");
	      String weight = mess.substring(index+1,kgPosition);
	      weight = weight.trim();
	      int w = Integer.parseInt(weight);
	      if(w>=75) {
	         System.out.println("�����е�����"+weight+"���ڻ����75 kg");
	      }  
	      else {
	         System.out.println("�����е�����"+weight+"С��75 kg");
	      }
	   }
}
