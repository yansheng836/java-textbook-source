package ch8.�ϻ�ʵ��ģ�����.ʵ��1;

class MobileShop {
	������1��// ���ڲ���InnerPurchaseMoney��������purchaseMoney1
	������2�� // ���ڲ���InnerPurchaseMoney��������purchaseMoney1
	private int mobileAmount;  // �ֻ�������

	MobileShop(){
	    ������3�� //������ֵΪ20000��purchaseMoney1
	    ������4�� //������ֵΪ10000��purchaseMoney2
	   }

	void setMobileAmount(int m) {
		mobileAmount = m;
	}

	int getMobileAmount() {
		return mobileAmount;
	}

	class InnerPurchaseMoney {
		int moneyValue;

		InnerPurchaseMoney(int m) {
			moneyValue = m;
		}

		void buyMobile() {
			if (moneyValue >= 20000) {
				mobileAmount = mobileAmount - 6;
				System.out.println("�ü�ֵ" + moneyValue + "���ڲ����������6���ֻ�");
			} else if (moneyValue < 20000 && moneyValue >= 10000) {
				mobileAmount = mobileAmount - 3;
				System.out.println("�ü�ֵ" + moneyValue + "���ڲ����������3���ֻ�");
			}
		}
	}
}

public class MainClass {
	public static void main(String args[]) {
		MobileShop shop = new MobileShop();
		shop.setMobileAmount(30);
		System.out.println("�ֻ�ר����Ŀǰ��" + shop.getMobileAmount() + "���ֻ�");
		shop.purchaseMoney1.buyMobile();
		shop.purchaseMoney2.buyMobile();
		System.out.println("�ֻ�ר����Ŀǰ��" + shop.getMobileAmount() + "���ֻ�");
	}
}
