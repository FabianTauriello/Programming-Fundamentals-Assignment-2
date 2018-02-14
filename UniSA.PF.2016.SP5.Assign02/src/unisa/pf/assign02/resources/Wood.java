package unisa.pf.assign02.resources;

/**
 * The Wood class is used to create Wood objects.
 * 
 * @author Fabian Tauriello
 */
public class Wood extends Resource
{	
	/**
	 * No-argument Wood constructor.
	 */	
	public Wood()
	{
		// call the super constructor and give the object default values.
		super("Wood", 0); 
	}
	
	/**
	 * Wood constructor specifying the name of the wood object.
	 * 
	 * @param name name of the wood object.
	 */	
	public Wood(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the other variable with a default value. 
		 */
		super(name, 0);
	}
	
	/**
	 * Wood constructor specifying the amount of wood in an object.
	 * 
	 * @param resourceCounter amount of wood in an object.
	 */
	public Wood(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of Resources 
		 * (provided in the parameters) and assign the other 
		 * variable with a default value. 
		 */
		super("Wood", resourceCounter);
	}

	/**
	 * Gives a description of Wood.
	 * 
	 * @return the description of Wood.
	 */
	@Override
	public String getDescription() {
		return "Processed Tree";
	}
}
