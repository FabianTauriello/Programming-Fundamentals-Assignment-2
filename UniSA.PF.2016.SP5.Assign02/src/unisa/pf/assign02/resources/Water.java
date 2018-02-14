package unisa.pf.assign02.resources;

/**
 * The Water class is used to create Water objects.
 * 
 * @author Fabian Tauriello
 */
public class Water extends Resource
{
	/**
	 * No-argument Water constructor.
	 */	
	public Water()
	{
		// call the super constructor and give the object default values.
		super("Water", 0); 
	}
	
	/**
	 * Water constructor specifying the name of the water object.
	 * 
	 * @param name name of the water object.
	 */	
	public Water(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the other variable with a default value. 
		 */
		super(name, 0);
	}

	/**
	 * Water constructor specifying the amount of water in an object.
	 * 
	 * @param resourceCounter amount of water in an object.
	 */
	public Water(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of Resources 
		 * (provided in the parameters) and assign the other variable with a default value. 
		 */
		super("Water", resourceCounter);
	}

	/**
	 * Gives a description of Water.
	 * 
	 * @return the description of Water.
	 */
	@Override
	public String getDescription()
	{
		return "Essence of Life";
	}

}
