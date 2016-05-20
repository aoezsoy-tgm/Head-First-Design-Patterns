package headfirst.designpatterns.combining.observer;

/**
 * AbstractDuckFactory - Eine Abstrakte Klasse die abtrakte Methoden beinhaltet.
 * Zugeh�rigkeit: Factory Pattern(Factory Method)
 * Beschreibung allgemein f�r alle Klassen, die zu Factory Pattern(Factory Method) 
 * geh�ren : 
 * Die Enten werden jeweils von den Klassen DuckFactory und CountingDuckFactory 
 * instanziiert und werden als Quackable zur�ckgegeben. Die Klasse CountingDuckFactory 
 * erweitert die Enten mit einem QuackCounter und gibt diesen zur�ck. 
 * Es werden dabei keine Methoden von der Klasse AbstractDuckFactory implementiert 
 * und aus diesem Grund ist es keine Abstract Factory, sondern ein Factory Method.
 * @author Oezsoy Ahmet
 * @version 20.05.2016
 */
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
