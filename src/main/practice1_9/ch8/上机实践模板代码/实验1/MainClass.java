package ch8.上机实践模板代码.实验1;

class MobileShop {
	【代码1】// 用内部类InnerPurchaseMoney声明对象purchaseMoney1
	【代码2】 // 用内部类InnerPurchaseMoney声明对象purchaseMoney1
	private int mobileAmount;  // 手机的数量

	MobileShop(){
	    【代码3】 //创建价值为20000的purchaseMoney1
	    【代码4】 //创建价值为10000的purchaseMoney2
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
				System.out.println("用价值" + moneyValue + "的内部购物卷买了6部手机");
			} else if (moneyValue < 20000 && moneyValue >= 10000) {
				mobileAmount = mobileAmount - 3;
				System.out.println("用价值" + moneyValue + "的内部购物卷买了3部手机");
			}
		}
	}
}

public class MainClass {
	public static void main(String args[]) {
		MobileShop shop = new MobileShop();
		shop.setMobileAmount(30);
		System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
		shop.purchaseMoney1.buyMobile();
		shop.purchaseMoney2.buyMobile();
		System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
	}
}
