/**
 * 
 */

/**
 * @author Bety‡rKšrte
 *
 */
public class AntSmell implements TimeDependent, Smell {

	private int timer;
	private static int timerMax = 50;

	@Override
	public void neutralizeIt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTimerToMax() {
		timer = timerMax;
	}

	@Override
	public void reduceTimer() {
		if (timer > 0) timer--;
	}

	@Override
	public void setModification(Tentacle t, Direction d) {
		// TODO Auto-generated method stub
		
	}

}
