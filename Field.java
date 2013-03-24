import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public class Field {
	
	private HashMap<Direction, Field> neighbors;
	private StaticElement se;
	private ArrayList<DynamicElement> de;
	private ArrayList<Smell> smells;
	private Venom v;
	
	public Field() {
		neighbors = new HashMap<Direction, Field>();
		de = new ArrayList<DynamicElement>();
		smells = new ArrayList<Smell>();
	}
	
	public ArrayList<Smell> getSmells() {
		return smells;
	}
	
	public void setSmell(Smell s) {
		smells.add(s);
	}
	
	/**
	 * @return the se
	 */
	public StaticElement getStaticElement() {
		return se;
	}

	/**
	 * @param se
	 */
	public void setStaticElement(StaticElement se) {
		this.se = se;
	}
	
	/**
	 * @return the de
	 */
	public ArrayList<DynamicElement> getDynamicElement() {
		return de;
	}

	/**
	 * @param de
	 */
	public void setDynamicElement(DynamicElement de) {
		this.de.add(de);
	}
	
	public void removeDynamicElement(DynamicElement de) {
		this.de.remove(de);
	}

	public void scanModification(Tentacle t, Direction d) {
		
	}
	
	public Field getNeigbor(Direction d) {
		return neighbors.get(d);
	}
	
	/**
	 * @param f the field to set
	 * @param d the direction to set the field in
	 */
	public void addNeighbor(Field f, Direction d) {
		neighbors.put(d, f);
	}
	
	public void neutralizeAntSmell() {
		
	}

	/**
	 * @return the v
	 */
	public Venom getVenom() {
		return v;
	}

	/**
	 * @param v the v to set
	 */
	public void setVenom(Venom v) {
		this.v = v;
	}
}
