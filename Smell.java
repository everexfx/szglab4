/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public interface Smell {
	abstract public void neutralizeIt();
	
	/**
	 * a sajat iranyaban a tentacle-re meghivja a setModificationInDirectiont, 
	 * amiben atadja az iranyat, es a modifikaciojat
	 * @param t
	 * @param d
	 */
	abstract public void setModification(Tentacle t, Direction d);
}
