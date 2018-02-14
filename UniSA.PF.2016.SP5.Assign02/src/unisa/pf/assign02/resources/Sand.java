package unisa.pf.assign02.resources;

/**
 * The Sand class is used to create Sand objects.
 * 
 * @author Fabian Tauriello
 */
public class Sand extends Resource
{
	/**
	 * No-argument Sand constructor.
	 */
	public Sand()
	{
		// call the super constructor and give the object default values.
		super("Sand", 0);
	}

	/**
	 * Sand constructor specifying the name of the sand object.
	 * 
	 * @param name name of the sand object.
	 */	
	public Sand(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the other variable with a default value. 
		 */
		super(name, 0);
	}

	/**
	 * Sand constructor specifying the amount of sand in an object.
	 * 
	 * @param resourceCounter amount of sand in an object.
	 */
	public Sand(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of Resources 
		 * (provided in the parameters) and assign the other 
		 * variable with a default value. 
		 */
		super("Dirt", resourceCounter);
	}
	
	/**
	 * Gives a description of Sand.
	 * 
	 * @return the description of Sand.
	 */
	@Override
	public String getDescription() 
	{
		return "Hot in the Sun";
	}
}
