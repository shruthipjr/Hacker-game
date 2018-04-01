

public class AlienDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OgreAlien brutus = new OgreAlien(); 
		SnakeAlien slimy = new SnakeAlien(); 
		MarshmallowAlien puffy = new MarshmallowAlien(); 
		
		// 3 aliens in the pack
		AlienPack pack = new AlienPack(3); 
		pack.addAlien(brutus, 0);
		pack.addAlien(slimy, 1);
		pack.addAlien(puffy, 2);
		System.out.println("Total pack damage = " + pack.calculateDamage());
		
		//creating objects by passing parameters
		OgreAlien brutus1 = new OgreAlien(100, "brutus"); 
		SnakeAlien slimy1 = new SnakeAlien(50, "slimy"); 
		MarshmallowAlien puffy1 = new MarshmallowAlien(70,"puffy"); 
		AlienPack pack1 = new AlienPack(3);
		pack1.addAlien(brutus1, 0);
		pack1.addAlien(slimy1, 1);
		pack1.addAlien(puffy1, 2);
		System.out.println("Total pack damage using parameterised constructor = " + pack1.calculateDamage());
		
	}

}
