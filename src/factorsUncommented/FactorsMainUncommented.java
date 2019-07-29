package factorsUncommented;

/**
 * Hauptprogramm f�r die Berechnung aller Teiler einer angegebenen Zahl.
 */
public class FactorsMainUncommented {

	public static void main(String[] args) {
		
		Long number = (long)12;
		ComputeFactorsUncommented factors = new ComputeFactorsUncommented(number);
		factors.compute();
		
		System.out.println(factors);
	}
}
