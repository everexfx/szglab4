import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public class Map {
	
	private class Grid {
		private int x;
		private int y;
		
		public Grid(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void setGrid(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
	}
	
	private int foods;
	private int neutralizers = 10;
	private int sprays = 10;
	private boolean gameLost = false;
	private boolean gameWon = false;
	private int level = 1;
	private int ants;
	private ArrayList<TimeDependent> td;
	private HashMap<Grid, Field> fields;
	
	public Map() {
		td = new ArrayList<TimeDependent>();
		fields = new HashMap<Grid, Field>();
		loadMapFromFile();
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
	
	/**
	 * @return 
	 * 
	 */
	private void loadMapFromFile() {
		//most nem is igen kell f‡jlb—l beolvasni
		Grid tempG = new Grid(2, 2);
		fields.put(tempG,new Field());
		tempG.setGrid(1, 2);
		fields.put(tempG,new Field());
		tempG.setGrid(3, 2);
		fields.put(tempG,new Field());
		tempG.setGrid(2, 1);
		fields.put(tempG,new Field());
		tempG.setGrid(2, 3);
		fields.put(tempG,new Field());
		
		tempG.setGrid(2, 2);
		Field f = fields.get(tempG);
		
		tempG.setGrid(1, 2);
		Field temp = fields.get(tempG);
		f.addNeighbor(temp, Direction.LEFT);
		
		tempG.setGrid(3, 2);
		temp = fields.get(tempG);
		f.addNeighbor(temp, Direction.RIGHT);
		
		tempG.setGrid(2, 1);
		temp = fields.get(tempG);
		f.addNeighbor(temp, Direction.DOWN);
		
		tempG.setGrid(2, 3);
		temp = fields.get(tempG);
		f.addNeighbor(temp, Direction.UP);
	}

	/**
	 * @return the foods
	 */
	public int getFoods() {
		return foods;
	}

	/**
	 * @param foods the foods to set
	 */
	public void setFoods(int foods) {
		this.foods = foods;
	}

	/**
	 * @return the neutralizers
	 */
	public int getNeutralizers() {
		return neutralizers;
	}

	/**
	 * @param neutralizers the neutralizers to set
	 */
	public void setNeutralizers(int neutralizers) {
		this.neutralizers = neutralizers;
	}

	/**
	 * @return the sprays
	 */
	public int getSprays() {
		return sprays;
	}

	/**
	 * @param sprays the sprays to set
	 */
	public void setSprays(int sprays) {
		this.sprays = sprays;
	}

	/**
	 * @return the gameLost
	 */
	public boolean isGameLost() {
		return gameLost;
	}

	/**
	 * @param gameLost the gameLost to set
	 */
	public void setGameLost(boolean gameLost) {
		this.gameLost = gameLost;
	}

	/**
	 * @return the gameWon
	 */
	public boolean isGameWon() {
		return gameWon;
	}

	/**
	 * @param gameWon the gameWon to set
	 */
	public void setGameWon(boolean gameWon) {
		this.gameWon = gameWon;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
}
