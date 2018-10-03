package model.characters;

public class Vampire extends GameCharacter {
	
	private Integer x;
	private Integer y;
	
// ------------------------------------------------------------
// CONSTRUCTOR	

	public Vampire() {
		
	}
	
// ------------------------------------------------------------
// METHODS	
	
	@Override
	public void move(String direction, Integer quantity) {
		if(direction.equals("w")) {
			y -= 1;
		}
		
		if(direction.equals("s")) {
			y += 1;
		}
		
		if(direction.equals("a")) {
			x -= 1;
		}
		
		if(direction.equals("d")) {
			x += 1;
		}
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
}