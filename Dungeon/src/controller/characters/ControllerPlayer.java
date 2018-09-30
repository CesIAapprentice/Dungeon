package controller.characters;

import java.util.HashMap;

import model.characters.GameCharacter;
import model.characters.Player;

public class ControllerPlayer implements Movable{
	
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

	@Override
	public HashMap<Integer, Integer> getPosition(GameCharacter gameCharacter) {
		Player player = (Player) gameCharacter;
		return player.getPosition();
	}

	@Override
	public void setPosition(GameCharacter gameCharacter, Integer x, Integer y) {
		Player player = (Player) gameCharacter;
		player.setPosition(x, y);
	}
	

	
	
	
}