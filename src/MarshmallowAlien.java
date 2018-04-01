

public class MarshmallowAlien extends Alien{
	
	private final int MARSHMALLOW_DAMAGE = 1;

	//Default constructor
	public MarshmallowAlien(){
		super();
	}
	
	//Parameterized constructor
	public MarshmallowAlien( int health, String name)
	{ 
		super(health, name);
	}
	

	//method that returns the damage value
	public int getDamage(){
		return MARSHMALLOW_DAMAGE;
	}
	
}
