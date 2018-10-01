package model.characters;

import java.util.ArrayList;
import java.util.Collections;

public class Vampire extends GameCharacter {
	
	ArrayList<Integer> position;

	public Vampire() {
		this.position = super.position;
	}
	
	 

	public ArrayList<Integer> getPosition() {
		return position;
	}



	public void setPosition(Integer x, Integer y) {
		this.position.clear();
		Collections.addAll(this.position, x, y);
	}



	@Override
	public String getType() {
		return "vampire";
	}
}