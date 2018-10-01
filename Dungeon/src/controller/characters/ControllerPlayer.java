package controller.characters;

import java.util.ArrayList;
import model.characters.Player;

public class ControllerPlayer{
	
	private Player player;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public ControllerPlayer(Integer turns) {
		this.player = new Player(turns);
	}
	
//----------------------------------------------------
// METHODS

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}