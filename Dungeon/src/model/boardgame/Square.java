package model.boardgame;

import model.characters.GameCharacter;

public class Square {
	
	GameCharacter gameCharacter;
	
//----------------------------------------------------
// CONSTRUCTOR		

	public Square() {
		this.gameCharacter = null;
	}
	
//----------------------------------------------------
// METHODS		

	public GameCharacter getGameCharacter() {
		return gameCharacter;
	}

	public void setGameCharacter(GameCharacter gameCharacter) {
		this.gameCharacter = gameCharacter;
	}
	
	
	
	

}
