package headfirst.designpatterns.combining.observer;

/**
 * QuackCounter - Eine Klasse die vom Interface Quackable implementiert.
 * Zugehörigkeit: Decorator Pattern
 * Beschreibung allgemein für alle Klassen, die zu Decorator Pattern
 * gehören : 
 * Die statische Methode numberOfQuacks wird mittels der Klasse QuackCounter hochgezählt 
 * und somit werden die Enten um eine Counter-Funktion dekoriert. 
 * Die Duck-Implementationen sind die Kernkomponente, wie in der Klasse CountingDuckFactory ersichtlich.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	/**
	 * Beim Konstruktor wird duck zugewiesen.
	 */
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	/**
	 * Diese Methode ruft die Methode quack auf und erhöht die numberOfQuaks.
	 */
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	/**
	 * Eine getter-Methode für getQuacks. Hier wird die numberOfQuaks als int
	 * zurückgegeben.
	 */
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	/**
	 *  @param observer 
	 *  In dieser Methode wird die Methode registerObserver mit dem Parameter observer aufgerufen. 
	 *  Die Methode registerOberserver befindet sich in observable.
	 */
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 
	/**
	 * Bei dieser Methode wird der Observer benachrichtigt.
	 */
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
	/**
	 * Hier wird Quackable als String zurückgegeben.
	 */
	public String toString() {
		return duck.toString();
	}
}
