package controller.characters;

import java.util.ArrayList;
import java.util.Random;

import controller.boardgame.Boardgame;
import controller.boardgame.ControllerBoardgame;
import model.boardgame.Square;
import model.characters.Vampire;

public class ControllerVampire{
	
	ArrayList<Vampire> vampires;
	Vampiremove vampiremove;
	Random random;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public ControllerVampire(Boardgame boardgame) {
		this.vampiremove = new Vampiremove(boardgame);
		this.vampires = new ArrayList<Vampire>();
		this.random = new Random();
	}

//----------------------------------------------------
// METHODS
	
	public void createVampires(Integer numberOfVampires) {
		for (Integer i=0; i<numberOfVampires; i++) {
			this.vampires.add(new Vampire());
		}
	}
	
	public void killVampire(Vampire vampire) {
		this.vampires.remove(vampire);
	}

	public ArrayList<Vampire> getVampires() {
		return vampires;
	}

	public void setVampires(ArrayList<Vampire> vampires) {
		this.vampires = vampires;
	}
	
	public void moveVampires(Boardgame boardgame) {
		
	}
}