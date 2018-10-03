package controller.characters;

import java.util.ArrayList;
import java.util.Random;

import controller.boardgame.Boardgame;
import controller.boardgame.ControllerBoardgame;
import model.boardgame.Square;
import model.characters.Vampire;

public class ControllerVampire{
	
	Boardgame boardgame;
	ArrayList<Vampire> vampires;
	Vampiremove vampiremove;
	Random random;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public ControllerVampire(Boardgame boardgame) {
		this.boardgame = boardgame;
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
	
	public void moveVampires(ControllerBoardgame controllerboardgame) {
		for (Vampire vampire : vampires) {
			while(true) {
				
				//Where to move	
				Integer direction = random.nextInt(4);
				String[] formattedDirection = {"w", "s", "a", "d"}; 
			
				// where is the Vampire
				Integer x = vampire.getX();
				Integer y = vampire.getY();
			
				// match 360º movement
				if(direction == 0) {
					y -= 1;
					if(y < 0) {
						y +=10;
					}
				}
			
				if(direction == 1) {
					y += 1;
					if(y > 9) {
						y -=10;
					}
				}
			
				if(direction == 2) {
					x -= 1;
					if(x < 0) {
						x +=10;
					}
				}
			
				if(direction == 3) {
					x += 1;
					if(x > 9) {
						x -=10;
					}
				}
			
				//Test for moving only a valid move
				Square testSquare = controllerboardgame.getSquare(x, y);
				if(controllerboardgame.whosOnThisSquare(testSquare).equals("null")) {
					testSquare.setGameCharacter(vampire);
					vampire.move(formattedDirection[x], 1);
					break;
				}
				
				if(controllerboardgame.whosOnThisSquare(testSquare).equals("player")) {
					this.getVampires().remove(vampire);
					break;
				}
			}
		}
	}
}