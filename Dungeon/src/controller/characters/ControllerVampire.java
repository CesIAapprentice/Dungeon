package controller.characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.characters.GameCharacter;
import model.characters.Vampire;

public class ControllerVampire implements Movable{
	
	ArrayList<Vampire> vampires;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public ControllerVampire() {
		this.vampires = new ArrayList<Vampire>();
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

	@Override
	public HashMap<Integer, Integer> getPosition(GameCharacter gameCharacter) {
		Vampire vampire = (Vampire) gameCharacter;
		return vampire.getPosition();
	}

	@Override
	public void setPosition(GameCharacter gameCharacter, Integer x, Integer y) {
		Vampire vampire = (Vampire) gameCharacter;
		vampire.setPosition(x,y);
	}	
}