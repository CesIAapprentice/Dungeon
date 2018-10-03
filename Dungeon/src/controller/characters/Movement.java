package controller.characters;

import controller.boardgame.Boardgame;
import model.characters.GameCharacter;

public abstract class Movement {
	
	public void goInbounds(GameCharacter gamecharacter, Boardgame boardgame) {
		Integer x = gamecharacter.getX();
		Integer y = gamecharacter.getY();
		Integer row = boardgame.getBoardgame().size();
		Integer column = boardgame.getBoardgame().get(0).size();
		
		if(y < 0) {
			y +=column;
		}
		if(y > column-1) {
			y -=column;
		}
		if(x < 0) {
			x +=row;
		}
		if(x > row-1) {
			x -=row;
		}
	}
	
	

}
