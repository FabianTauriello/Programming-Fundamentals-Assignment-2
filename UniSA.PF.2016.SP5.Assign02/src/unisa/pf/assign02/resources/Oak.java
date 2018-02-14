package unisa.pf.assign02.resources;

/**
 * The Dirt class is used to create Dirt objects using the Tree 
 * and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Oak extends Tree
{	
	/**
	 * No-argument Oak constructor.
	 */	
	public Oak()
	{
		// give the object a default name.
		this.setName("Oak");
	}
	
	/**
	 * Oak constructor specifying the name of the oak object.
	 * 
	 * @param name name of the oak object.
	 */
	public Oak(String name)
	{
		// assign a name to an Oak object with the name given.
		this.setName(name);
	}

	/**
	 * Oak constructor specifying the amount of oak in an object.
	 * 
	 * @param resourceCounter amount of oak in an object.
	 */
	public Oak(int resourceCounter)
	{
		// give the object a default name.
		this.setName("Oak");
		// assign a number of resources to an Oak object with the number given.
		this.setNumber(resourceCounter);
	}

	/**
	 * Gives a description of Oak.
	 * 
	 * @return the description of Oak.
	 */
	@Override
	public String getDescription()
	{
		return "Nice for Furniture";
	}
}
