package unisa.pf.assign02.resources;

/**
 * The Metal class provides a blueprint for creating Metal resources.
 * 
 * @author Fabian Tauriello
 */
abstract public class Metal extends Resource
{
	/**
	 * This variable represents the number of resources on hand
	 */
	private boolean isEnchanted;


	/**
	 * No-argument Metal constructor.
	 */
	public Metal()
	{

	}


	/**
	 * Metal constructor specifying enchantment status of the metal.
	 * 
	 * @param isEnchanted whether the metal is enchanted.
	 */
	public Metal(boolean isEnchanted)
	{	
		// assign a Metal with an enchantment (or not).
		this.isEnchanted = isEnchanted;
	}


	/**
	 * Metal constructor for setting all possible attributes - 
	 * name, resourceCounter, and isEnchanted.
	 * 
	 * @param name name of the metal.
	 * @param resourceCounter number of metal.
	 * @param isEnchanted whether the metal is enchanted.
	 */
	public Metal(String name, int resourceCounter, boolean isEnchanted)
	{
		// assign the calling object with a name given in the parameters.
		this.setName(name);
		// assign the calling object with a number of Metals given in the parameters.
		this.setNumber(resourceCounter);
		// assign a Metal with an enchantment (or not).
		this.isEnchanted = isEnchanted;
	}


	/**
	 * Tests if an object is enchanted.
	 * 
	 * @return true if the object is enchanted.
	 */
	public boolean isEnchanted()
	{
		/*
		 * test if the metal is enchanted. If it is, return true. 
		 * If not, return false
		 */
		if (isEnchanted == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	/**
	 * Converts an object and its variables into a string.
	 * 
	 * @return an object as a string.
	 */
	@Override
	public String toString()
	{
		return this.getName() + " Metal" + ", number Remaining=" + 
				this.getNumber() + " enchanted=" + this.isEnchanted;
	}
}
