package controller.characters;

import java.util.ArrayList;
import java.util.Random;

import controller.boardgame.ControllerBoardgame;
import model.boardgame.Square;
import model.characters.Vampire;

public class ControllerVampire{
	
	ArrayList<Vampire> vampires;
	Random random;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public ControllerVampire() {
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
			Integer direction = random.nextInt(4);
			Integer x = vampire.getPosition().get(0);
			Integer y = vampire.getPosition().get(1);
			
			if(direction == 0) {
				y -= 1;
				if(y > 0) {
					y +=10;
				}
			}
			
			if(direction == 0) {
				y -= 1;
				if(y > 0) {
					y +=10;
				}
			}
			
			
					Square testSquare = controllerboardgame.getSquare(x, y);
					if(controllerboardgame.whosOnThisSquare(testSquare).equals("null")) {
						testSquare.setGameCharacter(vampire);
						vampire.move(x, y);
					}
					
					if(whosOnThisSquare(testSquare).equals("null")) {
				}
			}
		}
	}
}