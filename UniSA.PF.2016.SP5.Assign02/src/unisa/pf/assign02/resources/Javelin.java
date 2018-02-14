package unisa.pf.assign02.resources;

/**
 * The Javelin class is used to create Javelin objects using the 
 * Weapon and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Javelin extends Weapon
{
	/**
	 * No-argument Javelin constructor.
	 */	
	public Javelin()
	{
		// call the super constructor and give the object default values.
		super("Javelin", 0, 5.0, 10.0);
	}
	
	
	/**
	 * Javelin constructor specifying the name of the Javelin object.
	 * 
	 * @param name name of the Javelin object.
	 */
	public Javelin(String name)
	{
		/* call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the rest of the variables with default values. */
		super(name, 0, 5.0, 10.0);
	}

	
	/**
	 * Javelin constructor specifying the amount of javelins in an object.
	 * 
	 * @param resourceCounter amount of javelins in an object.
	 */
	public Javelin(int resourceCounter)
	{
		/* call the super constructor and give the object a number of resources 
		 * (provided in the parameters) and assign the rest of the 
		 * variables with default values. */
		super("Javelin", resourceCounter, 5.0, 10.0);
	}
	

	/**
	 * Gives a description of Javelin.
	 * 
	 * @return the description of Javelin.
	 */
	@Override
	public String getDescription()
	{
		return "Preferred Weapon Of Kids at High School Sports Days";
	}
}
