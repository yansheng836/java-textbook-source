package ch6.�ϻ�ʵ��ģ�����.ʵ��2;

interface DogState {
	public void showState();
}

class SoftlyState implements DogState {
	// ������1�� //��дpublic void showState()
}

class MeetEnemyState implements DogState {
	// ������2�� //��дpublic void showState()
}

class MeetFriendState implements DogState {
	// ������3�� //��дpublic void showState()
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
