package factors;

/**
 * Hauptprogramm.
 * 
 * <p>Diese Klasse enthält die für Javadoc kommentierte Version als Lösung
 * der Aufgabe in der LaTeX-Datei javadoc8.
 * 
 * @param args Nicht verwendet.
 */
public class FactorsMain {

	public static void main(String[] args) {
		
		Long number = (long)12;
		ComputeFactors factors = new ComputeFactors(number);
		factors.compute();
		
		System.out.println(factors);
	}
}
