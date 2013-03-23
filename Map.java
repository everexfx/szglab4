import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public class Map {
	private int foods;
	private int neutralizers = 10;
	private int sprays = 10;
	private boolean gameLost = false;
	private boolean gameWon = false;
	private int level = 1;
	private int ants;
	private ArrayList<TimeDependent> td;
	
	public Map() {
		td = new ArrayList<TimeDependent>();
	}
	
	public void venomizeIt(int x, int y) {
		
	}
	
	public void neutralizeIt(int x, int y) {
		
	}
	
	public void tick() {
		
	}
	
	public void reduceAnts() {
		
	}
	
	public void reduceFoods() {
		
	}
	
	private Field translateCoordinates(int x, int y) {
		return null;
	}
}
