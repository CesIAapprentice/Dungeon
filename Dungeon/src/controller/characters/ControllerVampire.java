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
	public ArrayList<Integer> getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosition(ArrayList<Integer> position) {
		// TODO Auto-generated method stub
		
	}
	
}