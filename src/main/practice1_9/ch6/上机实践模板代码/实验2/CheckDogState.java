package ch6.上机实践模板代码.实验2;

interface DogState {
	public void showState();
}

class SoftlyState implements DogState {
	// 【代码1】 //重写public void showState()
}

class MeetEnemyState implements DogState {
	// 【代码2】 //重写public void showState()
}

class MeetFriendState implements DogState {
	// 【代码3】 //重写public void showState()
}

class Dog {
	DogState state;

	public void cry() {
		state.showState();
	}

	public void setState(DogState s) {
		state = s;
	}
}

public class CheckDogState {
	public static void main(String args[]) {
		Dog yellowDog = new Dog();
		yellowDog.setState(new SoftlyState());
		yellowDog.cry();
		yellowDog.setState(new MeetEnemyState());
		yellowDog.cry();
		yellowDog.setState(new MeetFriendState());
		yellowDog.cry();
	}
}
