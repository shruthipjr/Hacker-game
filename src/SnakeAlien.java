

public class SnakeAlien extends Alien{
	
	private final int SNAKE_DAMAGE = 10;
	
	//Default constructor
	public SnakeAlien(){
		super();
	}
	
	//Parameterized constructor
	public SnakeAlien( int health, String name)
	{ 
		super(health, name);
	}
	
	//method that returns the damage value
	public int getDamage(){
		return SNAKE_DAMAGE;
	}
}
