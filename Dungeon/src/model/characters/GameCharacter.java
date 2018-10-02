package model.characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class GameCharacter {
	
	protected ArrayList<Integer> position;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public GameCharacter() {
		this.position = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<Integer> position) {
		this.position = position;
	}
	
	
	
}