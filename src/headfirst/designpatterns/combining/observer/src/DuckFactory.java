package headfirst.designpatterns.combining.observer;

/**
 * DuckFactory - Eine Klasse die von der AbstractDuckFactory Klasse erbt und
 * die abstrakten Methoden in dieser Klasse �berschreibt.
 * Bei diesen Methoden werden neue Duckklassen instanziert.
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
public class DuckFactory extends AbstractDuckFactory {
  
	/**
	 * Bei dieser Methode wird eine neue MallarDuck-Klasse instanziiert 
	 * und als Quackable zur�ck gegegben.
	 */
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	/**
	 * Bei dieser Methode wird eine neue RedheadDuck-Klasse instanziiert 
	 * und als Quackable zur�ck gegegben.
	 */
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	/**
	 * Bei dieser Methode wird eine neue DuckCall-Klasse instanziiert 
	 * und als Quackable zur�ck gegegben.
	 */
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	/**
	 * Bei dieser Methode wird eine neue RubberDuck-Klasse instanziiert 
	 * und als Quackable zur�ck gegegben.
	 */
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
