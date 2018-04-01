

public  class AlienPack
{
	private Alien[] aliens;

	//Constructor
	public AlienPack (int numAliens)
	{
		aliens = new Alien[numAliens];
	}

	//SETTER: ADDING ALIENS TO THE PACK
	public void addAlien(Alien newAlien, int index)
	{
		aliens[index] = newAlien;
	}

	//getter
	public Alien[] getAliens()
	{
		return aliens;
	}

	// TO CALCULATE DAMAGE INFLICTED BY ALIEN PACK
	public int calculateDamage()
	{
		int damage = 0;
		for (int i=0; i < aliens.length; i++)
		{
			damage += aliens[i].getDamage(); 

		}

		return damage;
	}

}