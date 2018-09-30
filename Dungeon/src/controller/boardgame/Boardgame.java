package controller.boardgame;

import java.util.ArrayList;

import model.boardgame.Square;

public class Boardgame {
	
	private ArrayList<ArrayList<Square>> boardgame;
	
//----------------------------------------------------
// CONSTRUCTOR			
	
	public Boardgame() {
		this.boardgame = new ArrayList<ArrayList<Square>>();
	}
	
//----------------------------------------------------
// METHODS	

	public ArrayList<ArrayList<Square>> getBoardgame() {
		return boardgame;
	}

	public void setBoardgame(ArrayList<ArrayList<Square>> square) {
		this.boardgame = square;
	}
	
	
}