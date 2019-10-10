package ch12.Р§зг1;

public class Example12_1 {
	public static void main(String args[]) {
		ShowObject<Dog> showDog = new ShowObject<Dog>();
		showDog.showMess(new Dog());
		ShowObject<Cat> showCat = new ShowObject<Cat>();
		showCat.showMess(new Cat());
	}
}
