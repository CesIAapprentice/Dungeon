package controller.boardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.boardgame.Square;
import model.characters.GameCharacter;
import model.characters.Player;
import model.characters.Vampire;

public class ControllerBoardgame {
	
	private Boardgame boardgame;
	private Random random;
	
//----------------------------------------------------
// CONSTRUCTOR		

	public ControllerBoardgame() {
		this.boardgame = new Boardgame();
		createBoardgame(10,10);
		this.random = new Random();
	}
	
//----------------------------------------------------
// METHODS	
	
	public void createBoardgame(Integer x, Integer y) {
		for (Integer i=0; i<x; i++) {
			for(Integer j=0; j<y; j++) {
				ArrayList<Integer> position = new ArrayList<Integer>();
				Collections.addAll(position, i, j);
				getX(this.boardgame, x).add(new Square(position));
			}
		}
	}
	
	public void placeGameCharacter(Square square, GameCharacter gamecharacter) {
		square.setGameCharacter(gamecharacter);
		gamecharacter.setPosition(square.getPosition());
	}

	public String whosOnThisSquare(Square square) {
		if(square.getGameCharacter() == null) {
			return "empty";
		}
		
		if( square.getGameCharacter() instanceof Player) {
			return "player";
		}
		
		if( square.getGameCharacter() instanceof Vampire) {
			return "vampire";
		}
		
		return null;
	}
	
	public Square RandomSquare() {
		Integer x = random.nextInt(10);
		Integer y = random.nextInt(10);
		return this.getSquare(x, y);
	}
	
// GETTERS & SETTERS	
	
	public Boardgame getBoardgame() {
		return boardgame;
	}

	public void setBoardgame(Boardgame boardgame) {
		this.boardgame = boardgame;
	}
	
	public ArrayList<Square> getX(Boardgame boardgame, Integer x) {
		return boardgame.getBoardgame().get(x);
	}
	
	public Square getSquare(Integer x, Integer y) {
		ArrayList<Square> row = this.getX(getBoardgame(), x);
		return row.get(y);
	}
	
	public ArrayList<Integer> getPosition(Square square){
		return square.getPosition();
	}
}
