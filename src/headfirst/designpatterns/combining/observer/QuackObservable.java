package headfirst.designpatterns.combining.observer;

/**
 * QuackObservable - QuackObservable ist ein Interface mit 2 Methoden.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public interface QuackObservable {
	/**
	 * Die Methode hat einen Parameter mit dem Typen observer
	 */
	public void registerObserver(Observer observer);
	/**
	 * Die Methode dient zur Benachrichtigung f�r den Observer.
	 */
	public void notifyObservers();
}
