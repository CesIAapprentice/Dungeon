package model.characters;

import java.util.ArrayList;
import java.util.Collections;

public class Player extends GameCharacter {

	Integer turns;
	ArrayList<Integer> position;
	
	public Player(Integer turns) {
		this.turns = turns;
		Collections.addAll(position, 0, 0);
		this.position = super.position;
	}
	
	

	public Integer getTurns() {
		return turns;
	}



	public void setTurns(Integer turns) {
		this.turns = turns;
	}



	public ArrayList <Integer> getPosition() {
		return position;
	}



	public void setPosition(ArrayList<Integer> position) {
		this.position.clear();
		this.position = position;
	}



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "player";
	}

}
