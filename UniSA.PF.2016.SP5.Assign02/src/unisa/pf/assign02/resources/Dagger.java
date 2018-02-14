package unisa.pf.assign02.resources;

/**
 * The Dagger class is used to create Dagger objects using the Weapon and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Dagger extends Weapon
{

	/**
	 * No-argument EnchantedPoleArm constructor.
	 */	
	public Dagger()
	{
		// call the super constructor and give the object default values.
		super("Dagger", 0, 2.0, 5.0);
	}
	
	
	/**
	 * Dagger constructor specifying the name of the Dagger object.
	 * 
	 * @param name name of the Dagger object.
	 */
	public Dagger(String name)
	{
		/* call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the rest of the variables with default values. */
		super(name, 0, 2.0, 5.0);
	}

	
	/**
	 * Dagger constructor specifying the amount of daggers in an object.
	 * 
	 * @param resourceCounter amount of daggers in an object.
	 */
	public Dagger(int resourceCounter)
	{
		/* call the super constructor and give the object a number of resources 
		 * (provided in the parameters) and assign the rest of the variables with default values. */
		super("Dagger", resourceCounter, 2.0, 5.0);
	}

	
	/**
	 * Gives a description of Dagger.
	 * 
	 * @return the description of Dagger.
	 */
	@Override
	public String getDescription()
	{
		return "Preferred Weapon of Thieves";
	}
}
