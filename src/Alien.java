
public class Alien { 
	
	public static final int SNAKE_ALIEN = 0; 
	public static final int OGRE_ALIEN = 1;
	public static final int MARSHMALLOW_MAN_ALIEN = 2;
	//public int type; // Stores one of the three above types 
	private int health; // 0=dead, 100=full strength 
	private String name;
	
	//Default constructor
	public Alien(){
		
		health = 0;
		name = null;
		
	}
	
	//parameterized constructor
	public Alien( int health, String name)
	{ 
		this.health = health;
		this.name = name; 
	}
	
	//Get method to get the value of health variable
	public int getHealth() {
		return health;
	}

	//Set method to set the health variable
	public void setHealth(int health) {
		this.health = health;
	}

	//Get method to get the value of name variable
	public String getName() {
		return name;
	}

	//Set method to set the name variable
	public void setName(String name) {
		this.name = name;
	}
	
	//method that returns the damage value
	public int getDamage(){
		return 0;
	}
	
}
