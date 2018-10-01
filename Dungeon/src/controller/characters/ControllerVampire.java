package controller.characters;

import java.util.ArrayList;
import java.util.Random;

import model.characters.Vampire;

public class ControllerVampire{
	
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
	
	public void moveVampires() {
		ArrayList<Vampire> vampires = this.getVampires();
		for (Vampire vampire : vampires) {
			Random direction = new Random(3);
			ArrayList<Integer> position = vampire.getPosition();
		}
	}
}