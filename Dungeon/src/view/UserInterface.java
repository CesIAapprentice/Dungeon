package view;

import java.util.Scanner;

import controller.boardgame.Boardgame;
import model.boardgame.Square;
import model.characters.GameCharacter;

public class UserInterface {
	
	Scanner reader;
	
//----------------------------------------------------
// CONSTRUCTOR	
	
	public UserInterface() {
		this.reader = new Scanner(System.in);
	}
	
//----------------------------------------------------
// METHODS		

	public void drawDungeon(Boardgame board) {
		for(Integer i=0; i<board.getBoardgame().size(); i++) {
			for(Square square : board.getBoardgame().get(0)) {
				drawSquare(square);
			}
		}
	}
	
	
	public void drawSquare(Square square) {
		GameCharacter temp = square.getGameCharacter();
		if(temp.equals(null)){
			System.out.println("*");
		}		
	}
	
	public String ask() {
		return reader.nextLine();
	}
}