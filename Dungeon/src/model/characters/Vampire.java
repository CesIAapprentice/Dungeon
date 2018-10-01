package model.characters;

import java.util.ArrayList;
import java.util.Collections;

import controller.characters.Movable;

public class Vampire extends GameCharacter implements Movable{
	
	ArrayList<Integer> position;
	
// ------------------------------------------------------------
// CONSTRUCTOR	

	public Vampire() {
		this.position = super.position;
	}
	
// ------------------------------------------------------------
// METHODS	
	
	@Override
	public void move(Integer x, Integer y) {
		Integer oldX = this.getPosition().get(0);
		Integer oldY = this.getPosition().get(1);
		ArrayList<Integer> position = new ArrayList<Integer>();
		Collections.addAll(position, oldX + x, oldY + y);
		this.setPosition(position);
	}
	
	public ArrayList<Integer> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<Integer> position) {
		this.position = position;
	}


}