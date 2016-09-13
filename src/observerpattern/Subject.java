package observerpattern;

public interface Subject {
	public void addObserver(Observer observer);

	public void deleteObserver(Observer observer);

	public void notifyObserver(String context);

	public void start();

	public void stop();
}
