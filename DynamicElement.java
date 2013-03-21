/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public abstract class DynamicElement {
	private Map m;
	private Field position;
	private Direction d;
	
	public DynamicElement(Map map, Direction dir, Field f) {
		m = map;
		setDirection(dir);
		setPosition(f);
	}

	/**
	 * @return the position
	 */
	public Field getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Field position) {
		this.position = position;
	}

	/**
	 * @return the d
	 */
	public Direction getDirection() {
		return d;
	}

	/**
	 * @param d the d to set
	 */
	public void setDirection(Direction d) {
		this.d = d;
	}
	
	/**
	 * 
	 */
	abstract void move();
	
	/**
	 * @param f
	 */
	abstract void reagateToFood(Food f);
	
	/**
	 * @param a
	 */
	abstract void reagateToAntLion(AntLion a);
	
	/**
	 * @param a
	 */
	abstract void reagateToAntEater(AntLion a);
	
	/**
	 * @param d
	 */
	abstract void stepOnThisDynamicElement(DynamicElement d);
}
