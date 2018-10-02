package controller.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import controller.boardgame.Boardgame;
import controller.boardgame.ControllerBoardgame;
import controller.characters.ControllerPlayer;
import controller.characters.ControllerVampire;
import model.boardgame.Square;
import model.characters.Player;
import model.characters.Vampire;

public class Game {
	
	Random random;
	
	private ControllerVampire controllerVampire;
	private ControllerPlayer controllerPlayer;
	private ControllerBoardgame controllerBoardgame;
	
//----------------------------------------------------
// CONSTRUCTOR

	public Game() {
		
		this.random = new Random();
		
		this.controllerPlayer = new ControllerPlayer(14);
		this.controllerVampire = new ControllerVampire();
		
		// This initializes Boardgame to an empty one
		this.controllerBoardgame = new ControllerBoardgame();
		
		initializePlayerPosition(0,0);
		initializeVampiresPosition();
	}
	
//----------------------------------------------------
// METHODS
// INITIALIZE

	
// PLAYER	
	public Player getPlayer() {
		return this.controllerPlayer.getPlayer();
	}
	
	public void initializePlayerPosition(Integer x, Integer y) {
		Player player = getPlayer();
		Square square = this.controllerBoardgame.getSquare(x, y);
		this.controllerBoardgame.placeGameCharacter(square, player);
	}
	
// VAMPIRES
	
	public ArrayList<Vampire> getVampires() {
		return this.controllerVampire.getVampires();
	}
	
	public void initializeVampiresPosition() {
		ArrayList<Vampire> vampires = getVampires();
		for(Vampire vampire : vampires) {
			while(true) {
				Square square = this.controllerBoardgame.RandomSquare();
				if(this.controllerBoardgame.whosOnThisSquare(square).equals("null")) {
					this.controllerBoardgame.placeGameCharacter(square, vampire);
					break;
				}
			}
		}
	}	
	
// MOVE
	public void movePlayer(String movement) {
		ArrayList<Integer> position = getPlayer().getPosition();
		Integer x = position.get(0);
		Integer y = position.get(1);
		String formattedMovement = movement.toLowerCase();
		
	}
	
	public void moveVampires() {
		ArrayList<Vampire> vampires = getVampires();
		
		for (Vampire vampire : vampires) {
			
		}
	}
	
// HELPER METHODS

}