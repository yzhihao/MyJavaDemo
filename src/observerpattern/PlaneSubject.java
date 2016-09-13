package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class PlaneSubject implements Subject {

	List<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}

	@Override
	public void start() {
		String status = "我的飞机在开飞了";
		System.out.println(status);
		this.notifyObserver(status);
	}

	@Override
	public void stop() {
		String status = "我的飞机在降落了";
		System.out.println(status);
		this.notifyObserver(status);
	}

}
