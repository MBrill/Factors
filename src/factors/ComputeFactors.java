package factors;

import java.util.ArrayList;

/**
 * Berechnung aller Teiler einer ganzen Zahl. 
 *
 * <p>Diese Klasse enthält Javadoc-Kommentare als Lösung
 * der Aufgabe.
 */
public class ComputeFactors 
{

	/**
	 * Betrachtete Zahl.
	 * 
	 *<p>Für diese Zahl der Klasse {@code Long} werden in <em>compute</em>
	 * alle Teiler berechnet und im Feld <em>factors</em>
	 * abgelegt.
	 */
	private Long number;
	/**
	 * Liste mit allen Teilern.
	 * 
	 * <p>Diese Liste enthält alle berechneten Teiler, wenn vorher
	 * <em>compute</em> aufgerufen wurde. Vorher ist die 
	 * Liste leer.
	 */	
	private ArrayList<Long> factors;
	
	/**
	 * Defaultkonstruktor.
	 * 
	 * <p>Als zu bearbeitende Zahl wird 2 verwendet.
	 */
	public ComputeFactors() {
		this.number = (long)2;
		this.factors = new  ArrayList<Long>();
	}

	/**
	 * Konstruktor.
	 * 
	 * @param number Zahl, für die die Teiler berechnet werden sollen als Instanz der Klasse {@code Long}.
	 */
	public ComputeFactors(Long number) {
		this.number = number;
		this.factors = new  ArrayList<Long>();
	}
	
	/**
	 * Konstruktor.
	 * 
	 * @param number Zahl, für die die Teiler berechnet werden sollen als {@code long}-Wert.
	 */	
	public ComputeFactors(long number) {
		this.number = number;
		this.factors = new  ArrayList<Long>();
	}
	
	/**
	 * Berechnung aller Teiler.
	 * 
	 * <p>Diese Funktion berechnet alle Teiler der 
	 * in <em>number</em> abgespeicherten ganzen Zahl.
	 */
	public void compute() {
		Long helpDiv = (long)2;
		
		while (helpDiv <= this.number-1) {
			if (this.number % helpDiv == 0) {
				// Die Zahl helpDiv ist ein Teiler
				this.factors.add(helpDiv);
			}
			helpDiv++;
		}
	}
	
	/**
	 * Ausgabe der Teiler auf der Konsole.
	 * 
	 * <p>Sind die Teiler mit der Funktion <em>compute</em> berechnet
	 * worden, werden mit dieser Funktion die Teiler auf der Konsole ausgegeben.
	 */
	@Override
        public String toString() {
	    String text="";
	    text = "Die Teiler der Zahl " + this.number + " sind die folgenden ganzen Zahlen:\n";
	    text += this.factors.toString();
	    return text;
	}
}
