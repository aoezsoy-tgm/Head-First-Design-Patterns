package headfirst.designpatterns.combining.observer;

/**
 * CountingDuckFactory - Eine Klasse die von der AbstractDuckFactory Klasse erbt und
 * die abstrakten Methoden in dieser Klasse überschreibt.
 * Bei diesen Methoden werden immer andere Duckklassen aufgerufen.
 * Zugehörigkeit: Factory Pattern(Factory Method)
 * Beschreibung allgemein für alle Klassen, die zu Factory Pattern(Factory Method) 
 * gehören : 
 * Die Enten werden jeweils von den Klassen DuckFactory und CountingDuckFactory 
 * instanziiert und werden als Quackable zurückgegeben. Die Klasse CountingDuckFactory 
 * erweitert die Enten mit einem QuackCounter und gibt diesen zurück. 
 * Es werden dabei keine Methoden von der Klasse AbstractDuckFactory implementiert 
 * und aus diesem Grund ist es keine Abstract Factory, sondern ein Factory Method.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  
	/**
	 * Diese Methode ruft zuerst die QuackCounter-Klasse auf und dann wird
	 * in diesem eine neue MallardDuck-Klasse instanziiert.
	 */
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	/**
	 * Diese Methode ruft zuerst die QuackCounter-Klasse auf und dann wird
	 * in diesem eine neue RedheadDuck-Klasse instanziiert.
	 */
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	/**
	 * Diese Methode ruft zuerst die QuackCounter-Klasse auf und dann wird
	 * in diesem eine neue Duck-Klasse instanziiert.
	 */
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	/**
	 * Diese Methode ruft zuerst die QuackCounter-Klasse auf und dann wird
	 * in diesem eine neue RubberDuck-Klasse instanziiert.
	 */
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
