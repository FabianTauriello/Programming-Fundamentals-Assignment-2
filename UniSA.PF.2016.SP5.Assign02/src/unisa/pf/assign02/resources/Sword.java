package unisa.pf.assign02.resources;

/**
 * The Sword class is used to create Sword objects using the 
 * Weapon and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Sword extends Weapon
{
	/**
	 * No-argument Sword constructor.
	 */	
	public Sword()
	{
		// call the super constructor and give the object default values.
		super("Sword", 0, 8.0, 15.0);
	}
	
	
	/**
	 * Sword constructor specifying the name of the Sword object.
	 * 
	 * @param name name of the Sword object.
	 */
	public Sword(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the rest of the variables with default values. 
		 */
		super(name, 0, 8.0, 15.0);
	}

	
	/**
	 * Sword constructor specifying the amount of swords in an object.
	 * 
	 * @param resourceCounter amount of swords in an object.
	 */
	public Sword(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of resources (provided in 
		 * the parameters) and assign the rest of the variables with default values. 
		 */
		super("Sword", resourceCounter, 8.0, 15.0);
	}
	

	/**
	 * Gives a description of Sword.
	 * 
	 * @return the description of Sword.
	 */
	@Override
	public String getDescription()
	{
		return  "Preferred Weapon of Poorer Warriors";
	}
}
