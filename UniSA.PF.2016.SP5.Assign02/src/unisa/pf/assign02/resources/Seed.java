package unisa.pf.assign02.resources;

/**
 * The Seed class is used to create Seed objects.
 * 
 * @author Fabian Tauriello
 */
public class Seed extends Resource
{
	/**
	 * No-argument Seed constructor.
	 */	
	public Seed()
	{
		// call the super constructor and give the object default values.
		super("Seed", 0); 
	}

	/**
	 * Seed constructor specifying the name of the seed object.
	 * 
	 * @param name name of the seed object.
	 */	
	public Seed(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the other variable with a default value. 
		 */
		super(name, 0);
	}

	/**
	 * Seed constructor specifying the amount of seed in an object.
	 * 
	 * @param resourceCounter amount of seeds in an object.
	 */
	public Seed(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of Resources 
		 * (provided in the parameters) and assign the other variable with a default value. 
		 */
		super("Seed", resourceCounter);
	}

	/**
	 * Gives a description of Seed.
	 * 
	 * @return the description of Seed.
	 */
	@Override
	public String getDescription() 
	{
		return "One Day a Mighty Tree";
	}
}
