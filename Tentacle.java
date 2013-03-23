import java.util.HashMap;

/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public class Tentacle {
	
	/**
	 * tarolja az irany kulcsok alapjan a valtoztatas ertekeket
	 */
	private HashMap<Direction, Double> prob;
	
	/**
	 * konstruktor
	 */
	public Tentacle () {
		prob = new HashMap<Direction, Double>();
	}
	
	/**
	 * hozzaszorozza az adott elem valtoztatasat az adott iranyban
	 */
	public void setModificationInDirection(double mod, Direction dir) {
		mod *= prob.get(dir);
		prob.put(dir, mod);
	}
	
	public double getModificationInDirection(Direction dir) {
		return prob.get(dir);
	}
}
