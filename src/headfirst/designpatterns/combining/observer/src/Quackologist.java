package headfirst.designpatterns.combining.observer;

/**
 * Quackologist - Eine Klasse die vom Interface Observer implementiert.
 * Zugehörigkeit: Observer Pattern
 * Beschreibung allgemein für alle Klassen, die zu Observer Pattern
 * gehören : 
 * Die Klasse Quackologist ist die einzige Observer (Beobachter)-Klasse. 
 * Alle Enten werden zur Observable-Klasse referenziert,welche die Quackologist-Klasse 
 * mittels der Methode update() benachrichtigt.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public class Quackologist implements Observer {
 
	/**
	 * Bei dieser Methode update wird duck ausgegeben.
	 */
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	/**
	 * Eine toString-Methode, dass ein String ausgibt.
	 */
	public String toString() {
		return "Quackologist";
	}
}
