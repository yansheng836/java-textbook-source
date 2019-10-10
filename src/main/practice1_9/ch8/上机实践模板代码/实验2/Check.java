package ch8.�ϻ�ʵ��ģ�����.ʵ��2;

class Goods {
	boolean isDanger;
	String name;

	Goods(String name) {
		this.name = name;
	}

	public void setIsDanger(boolean boo) {
		isDanger = boo;
	}

	public boolean isDanger() {
		return isDanger;
	}

	public String getName() {
		return name;
	}
}

class DangerException extends Exception {
	String message;

	public DangerException() {
		message = "Σ��Ʒ!";
	}

	public void toShow() {
		System.out.print(message + " ");
	}
}

class Machine {
	public void checkBag(Goods goods) throws DangerException {
	      if(goods.isDanger()) { 
	         DangerException  danger=new DangerException() ;
	         ������1�� //�׳�danger
	      }
	   }
}

public class Check {
	public static void main(String args[]) {
	      Machine machine = new Machine();
	      Goods apple = new Goods("ƻ��"); 
	      apple.setIsDanger(false);  
	      Goods explosive = new Goods("ըҩ"); 
	      explosive.setIsDanger(true);
	      try { 
	         machine.checkBag(explosive);
	         System.out.println(explosive.getName()+"���ͨ��");
	      }
	      catch(DangerException e) {
	         ������2�� //e����toShow()����
	          System.out.println(explosive.getName()+"����ֹ!"); 
	      }
	      try { 
	         machine.checkBag(apple);
	         System.out.println(apple.getName()+"���ͨ��");
	      }
	      catch(DangerException e) {
	         e.toShow();
	         System.out.println(apple.getName()+"����ֹ!"); 
	      }
	   }
}
