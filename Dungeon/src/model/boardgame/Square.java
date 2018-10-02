package model.boardgame;

import java.util.ArrayList;

import model.characters.GameCharacter;

public class Square {
	
	GameCharacter gameCharacter;
	ArrayList<Integer> position;
	
//----------------------------------------------------
// CONSTRUCTOR		

	public Square(ArrayList<Integer> newPosition) {
		this.gameCharacter = null;
		this.position = newPosition;
	}
	
//----------------------------------------------------
// METHODS		

	public GameCharacter getGameCharacter() {
		return gameCharacter;
	}

	public void setGameCharacter(GameCharacter gameCharacter) {
		this.gameCharacter = gameCharacter;
	}

	public ArrayList<Integer> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<Integer> position) {
		this.position = position;
	}
	
	
	
	
	
	

}
