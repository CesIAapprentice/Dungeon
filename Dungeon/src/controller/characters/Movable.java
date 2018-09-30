package controller.characters;

import java.util.HashMap;

import model.characters.GameCharacter;

public interface Movable {
	
	public HashMap<Integer, Integer> getPosition(GameCharacter gameCharacter);
	public void setPosition(GameCharacter gameCharacter, Integer x, Integer y);

}
