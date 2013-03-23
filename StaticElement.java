/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public interface StaticElement {
	
	abstract public void stepOnS(DynamicElement d);
	
	/**
	 * a sajat iranyaban a tentacle-re meghivja a setModificationInDirectiont, 
	 * amiben atadja az iranyat, es a modifikaciojat
	 * @param t
	 * @param d
	 */
	abstract public void setModification(Tentacle t, Direction d);
}
