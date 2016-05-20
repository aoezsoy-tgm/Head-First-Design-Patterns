package headfirst.designpatterns.combining.observer;

/**
 * Observer - Observer ist ein Interface.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public interface Observer {
	/**
	 * Bei dieser Methode update wird QuackObservable mit dem Typ duck definiert..
	 */
	public void update(QuackObservable duck);
}
