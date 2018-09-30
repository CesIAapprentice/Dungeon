package model.characters;

import java.util.HashMap;
import java.util.Map;

public abstract class GameCharacter {
	
	protected HashMap<Integer, Integer> position;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public GameCharacter() {
		this.position = new HashMap<Integer, Integer>();
	}
	
	public abstract String getType();
}