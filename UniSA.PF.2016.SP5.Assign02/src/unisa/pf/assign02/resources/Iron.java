package unisa.pf.assign02.resources;

/**
 * The Iron class is used to create Iron objects using the Metal 
 * and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Iron extends Metal
{

	/**
	 * No-argument Steel constructor
	 */
	public Iron()
	{
		// call the super constructor and give the object default values.
		super("Iron", 0, false);
	}


	/**
	 * Iron constructor specifying enchantment status of the Iron.
	 * 
	 * @param isEnchanted
	 */
	public Iron(boolean isEnchanted)
	{
		/* 
		 * call the super constructor and give the object an enchantment 
		 * (provided in the parameters) and assign the rest of the 
		 * variables with default values.
		 */
		super("Iron", 0, isEnchanted);
	}


	/**
	 * Iron constructor specifying the enchantment status of Iron and the number of Iron.
	 * 
	 * @param isEnchanted
	 * @param resourceCounter
	 */
	public Iron(boolean isEnchanted, int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a default name. 
		 * assign the rest of the variables with values provided in the parameters.
		 */
		super("Iron", resourceCounter, isEnchanted);
	}


	/**
	 * Gives a description of Iron.
	 * 
	 * @return the description of Iron.
	 */
	@Override
	public String getDescription() 
	{
		return "Not Great Near The Ocean";
	}
}
