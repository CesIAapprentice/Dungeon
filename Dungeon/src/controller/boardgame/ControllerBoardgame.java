package controller.boardgame;

import java.util.ArrayList;

import model.boardgame.Square;
import model.characters.GameCharacter;

public class ControllerBoardgame {
	
	private Boardgame boardgame;
	
//----------------------------------------------------
// CONSTRUCTOR		

	public ControllerBoardgame() {
		this.boardgame = new Boardgame();
		createBoardgame(10,10);
	}
	
//----------------------------------------------------
// METHODS	
	
	public void createBoardgame(Integer x, Integer y) {
		for (Integer i=0; i<x; i++) {
			for(Integer j=0; j<y; j++) {
				getX(this.boardgame, x).add(new Square());
			}
		}
	}
	
	public ArrayList<Square> getX(Boardgame boardgame, Integer x) {
		return boardgame.getBoardgame().get(x);
	}
	
	public void placeGameCharacter(Square square, GameCharacter gamecharacter) {
		square.setGameCharacter(gamecharacter);
	}

	public Boardgame getBoardgame() {
		return boardgame;
	}

	public void setBoardgame(Boardgame boardgame) {
		this.boardgame = boardgame;
	}
	
	public GameCharacter checkSquare(Square square) {
		return square.getGameCharacter();
	}
}
