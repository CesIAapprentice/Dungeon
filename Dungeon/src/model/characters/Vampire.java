package model.characters;

import java.util.HashMap;

public class Vampire extends GameCharacter {
	
	HashMap<Integer, Integer> position;

	public Vampire() {
		this.position = super.position;
	}
	
	 

	public HashMap<Integer, Integer> getPosition() {
		return position;
	}



	public void setPosition(Integer x, Integer y) {
		this.position.put(x, y);
	}



	@Override
	public String getType() {
		return "vampire";
	}
}