package unisa.pf.assign02.resources;

/**
 * The Dirt class is used to create Dirt objects.
 * 
 * @author Fabian Tauriello
 */
public class Dirt extends Resource
{
	
	/**
	 * No-argument Dirt constructor.
	 */
	public Dirt()
	{
		// call the super constructor and give the object default values.
		super("Dirt", 0);
	}
	
	/**
	 * Dirt constructor specifying the name of the dirt object.
	 * 
	 * @param name name of the dirt object.
	 */
	public Dirt(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the other variable with a default value. 
		 */
		super(name, 0);
	}

	/**
	 * Dirt constructor specifying the amount of dirt in an object.
	 * 
	 * @param resourceCounter amount of dirt in an object.
	 */
	public Dirt(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of Resources 
		 * (provided in the parameters) and assign the other variable with a default value. 
		 */
		super("Dirt", resourceCounter);
	}

	/**
	 * Gives a description of Dirt.
	 * 
	 * @return the description of Dirt.
	 */
	@Override
	public String getDescription() 
	{
		return "Needed For Trees";
	}
}
