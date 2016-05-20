package headfirst.designpatterns.combining.observer;

/**
 * Quackable - Quakable erbt von QuackObservable und hat eine Methode quack.
 * Diese Methode steht zur Verf�gung damit man bei den anderen Duckklassen die Methode
 * verwenden bzw. �berschreiben k�nnen.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
