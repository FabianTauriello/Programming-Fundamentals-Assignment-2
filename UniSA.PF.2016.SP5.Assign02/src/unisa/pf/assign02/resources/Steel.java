package unisa.pf.assign02.resources;

/**
 * The Steel class is used to create Steel objects using the 
 * Metal and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Steel extends Metal
{
	/**
	 * No-argument Steel constructor
	 */
	public Steel()
	{
		// call the super constructor and give the object default values.
		super("Steel", 0, false);
	}


	/**
	 * Steel constructor specifying enchantment status of the Steel.
	 * 
	 * @param isEnchanted whether the steel is enchanted.
	 */
	public Steel(boolean isEnchanted)
	{
		/* 
		 * call the super constructor and give the object an enchantment 
		 * (provided in the parameters) and assign the rest of the variables with default values.
		 */
		super("Steel", 0, isEnchanted);
	}


	/**
	 * Steel constructor specifying the enchantment status 
	 * of Steel and the number of Steel.
	 * 
	 * @param isEnchanted whether the steel is enchanted.
	 * @param resourceCounter number of steel.
	 */
	public Steel(boolean isEnchanted, int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a default name. 
		 * assign the rest of the variables with values provided in the parameters.
		 */
		super("Steel", resourceCounter, isEnchanted);
	}


	/**
	 * Gives a description of Steel.
	 * 
	 * @return the description of Steel.
	 */
	@Override
	public String getDescription()
	{
		return "Cold Hard Steel";
	}
}
