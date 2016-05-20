package headfirst.designpatterns.combining.observer;

/**
 * DuckCall - Eine Klasse die von dem Interface Quakable implementiert. Das hei�t
 * es enth�lt alle Attribute und Methoden von Quakable.
 * Zugeh�rigkeit: Factory Pattern(Factory Method)
 * Beschreibung allgemein f�r alle Klassen, die zu Factory Pattern(Factory Method) 
 * geh�ren : 
 * Die Enten werden jeweils von den Klassen DuckFactory und CountingDuckFactory 
 * instanziert und werden als Quackable zur�ckgegeben. Die Klasse CountingDuckFactory 
 * erweitert die Enten mit einem QuackCounter und gibt diesen zur�ck. 
 * Es werden dabei keine Methoden von der Klasse AbstractDuckFactory implementiert 
 * und aus diesem Grund ist es keine Abstract Factory, sondern ein Factory Method.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public class DuckCall implements Quackable {
	Observable observable;

	/**
	 * Diese Methode erstellt eine neue Instanz von Observable mit 
	 * dem Parameter Observable.
	 */
	public DuckCall() {
		observable = new Observable(this);
	}
 
	/**
	 * Bei dieser Methode wird ein String ausgegeben und 
	 * danach ruft es die Methode notifyObserver auf.
	 */
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	/**
	 *  @param observer 
	 *  In dieser Methode wird die Methode registerObserver mit dem Parameter observer aufgerufen. 
	 *  Die Methode registerOberserver befindet sich in observable.
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	/**
	 *  Diese Methode ruft die Methode notifyObservers von der Klasse Observable auf.
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	/**
	 *  Diese Methode ist ein String und gibt den Namen der Ente 
	 *  als String aus: 'Duck Call'.
	 */
	public String toString() {
		return "Duck Call";
	}
}
