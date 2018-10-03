package controller.characters;

import java.util.Random;

import controller.boardgame.Boardgame;
import model.boardgame.Square;
import model.characters.GameCharacter;

public abstract class Movement {
	
	Random random;
	
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
	
	public Square getTestSquare (Boardgame boardgame, GameCharacter gamecharacter) {
		Integer direction = this.random.nextInt(4);
		Integer x = gamecharacter.getX();
		Integer y = gamecharacter.getY();
		
		x, y -> Random + position;
		ArrayList<Integer> inBoundsPosition = inBounds (x,y);	

		return boardgame.getSquare(inBoundsPosition); // sobrecarga
	}
	


public GameCharacter WhosInTheSquare (Square square)
	return square.getCharacter

public void setSquareCharacter(Square square, Character character);
	square.setGameCharacter = character; 

public void setSquareEmpty(Square square);
	square.setGameCharacter = null; 

public void updateCharacter (GameCharacter gamecharacter, Boardgame boardgame, Square newSquare)
	Integer oldX = gamecharacter.getX
	Integer oldY = gamecharacter.getY
	Integer newX = newSquare.getPosition[0]
	Integer newY = newSquare.getPosition[1]	

	setSquareEmpty((boardgame.getSquare(x,y))
	gamecharacter.setX = newX
	gamecharacter.setY = newY
	setSquareCharacter(newSquare, gamecharacter)
	
	

}
