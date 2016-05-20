package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * Observable - Eine Klasse die vom Interface QuackObservable implementiert.
 * Zugehörigkeit: Observer Pattern
 * Beschreibung allgemein für alle Klassen, die zu Observer Pattern
 * gehören : 
 * Die Klasse Quackologist ist die einzige Observer (Beobachter)-Klasse. 
 * Alle Enten werden zur Observable-Klasse referenziert,welche die Quackologist-Klasse 
 * mittels der Methode update() benachrichtigt.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public class Observable implements QuackObservable {
	
	ArrayList<Observer> observers = new ArrayList<Observer>(); // ArrayList für observer
	QuackObservable duck;
 
	/**
	 * Beim Konstruktor wird duck zugewiesen.
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	/**
	 *  @param observer 
	 *  In dieser Methode werden Elemente in die ArrayList hinzugefügt.
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	/**
	 * Bei dieser Methode werden alle Elemente durchgegangen mithilfe vom Iterator.
	 */
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	/**
	 * Eine getter-Methode, dass Observer mit dem Iterator zurückliefert.
	 */
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}       
