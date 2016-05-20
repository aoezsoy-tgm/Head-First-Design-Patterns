package headfirst.designpatterns.combining.observer;

/**
 * Goose - Eine Klasse das zwei Methoden zur Verfügung stellt.
 * Zugehörigkeit: Adapter Pattern
 * Beschreibung allgemein für alle Klassen, die zu Adapter Pattern
 * gehören : 
 * Eine Gans kann durch die GooseAdapter-Klasse auch als Quackable angesehen werden, 
 * da die quack()-Methode die honk()-Methode aufruft.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public class Goose {

	/**
	 * Eine Methode, dass Honk in der Konsole ausgibt.
	 */
	public void honk() {
		System.out.println("Honk");
	}

	/**
	 * Eine toString-Methode, dass ein String zurückliefert.
	 */
	public String toString() {
		return "Goose";
	}
}
