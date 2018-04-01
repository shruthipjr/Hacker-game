
public class OgreAlien extends Alien{

	private final int OGRE_DAMAGE = 6;
	
	//Default constructor
	public OgreAlien(){
		super();
	}
	
	//Parameterized constructor
	public OgreAlien( int health, String name)
	{ 
		super(health, name);
	}
	
	//method that returns the damage value
	public int getDamage(){
		return OGRE_DAMAGE;
	}
}
