package model.characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class GameCharacter {
	
	protected Integer x;
	protected Integer y;
	
//----------------------------------------------------
// CONSTRUCTOR	

	public GameCharacter() {
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public void move(String direction, Integer quantity) {
		
	}
}