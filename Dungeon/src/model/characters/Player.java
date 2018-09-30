package model.characters;

import java.util.HashMap;

public class Player extends GameCharacter {

	Integer turns;
	HashMap<Integer, Integer> position;
	
	public Player(Integer turns) {
		this.turns = turns;
		super.position.put(0, 0);
		this.position = super.position;
	}
	
	

	public Integer getTurns() {
		return turns;
	}



	public void setTurns(Integer turns) {
		this.turns = turns;
	}



	public HashMap<Integer, Integer> getPosition() {
		return position;
	}



	public void setPosition(Integer x, Integer y) {
		this.position.put(x, y);
	}



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "player";
	}

}
