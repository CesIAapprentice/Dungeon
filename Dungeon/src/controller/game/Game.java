package controller.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import controller.boardgame.Boardgame;
import controller.boardgame.ControllerBoardgame;
import controller.characters.ControllerPlayer;
import controller.characters.ControllerVampire;
import model.boardgame.Square;
import model.characters.GameCharacter;
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
		this.controllerBoardgame = new ControllerBoardgame();
		
		initializePlayerPosition(0,0);
		initializeVampiresPosition();
	}
	
//----------------------------------------------------
// METHODS
// INITIALIZE

// BOARDGAME	
	public Boardgame getBoardgame() {
		return this.controllerBoardgame.getBoardgame();
	}
	
	public Square getSquare(Integer x, Integer y) {
		ArrayList<Square> row = this.controllerBoardgame.getX(getBoardgame(), x);
		return row.get(y);
	}
	
	
// PLAYER	
	public Player getPlayer() {
		return this.controllerPlayer.getPlayer();
	}
	
	public void initializePlayerPosition(Integer x, Integer y) {
		Player player = getPlayer();
		player.setPosition(x, y);
		Square square = getSquare(x,y);
		square.setGameCharacter(player);
	}
	
	
// VAMPIRES
	
	public ArrayList<Vampire> getVampires() {
		return this.controllerVampire.getVampires();
		
	}
	public void initializeVampiresPosition() {
		ArrayList<Vampire> vampires = getVampires();
		
		for(Vampire vampire : vampires) {
			while(true) {
				int x = this.random.nextInt(9);
				int y = this.random.nextInt(9);
				Square square = getSquare(x, y);
				if(square.getGameCharacter() == null) {
					vampire.setPosition(x, y);
					square.setGameCharacter(vampire);
					break;
				}
			}
		}
	}
	
	
// MOVE
	
	public ArrayList<Integer> getPosition(GameCharacter gamecharacter){
		return gamecharacter.getPosition();
	}
	
	public boolean colision(Integer x, Integer y) {
		Square square = getSquare(x, y);
		return square.getGameCharacter() != null;
	}
	
	public void movePlayer(String movement) {
		ArrayList<Integer> position = getPosition(getPlayer());
		Integer x = position.get(0);
		Integer y = position.get(1);
		String formattedMovement = movement.toLowerCase();
		
	}
	
	public void moveVampires() {
		ArrayList<Vampire> vampires = getVampires();
		
		for (Vampire vampire : vampires) {
			
		}
	}
}