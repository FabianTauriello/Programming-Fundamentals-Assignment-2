package unisa.pf.assign02.resources;

/**
 * The Weapon class provides a blueprint for creating Weapon resources.
 * 
 * @author Fabian Tauriello
 */
abstract public class Weapon extends Resource
{

	/**
	 * This variable represents the minimum amount of 
	 * damage a type of weapon can make
	 */
	private double damageMin;


	/**
	 * This variable represents the maximum amount of 
	 * damage a type of weapon can make
	 */
	private double damageMax;


	/**
	 * No-argument Weapon constructor.
	 */
	public Weapon()
	{

	}


	/**
	 * Weapon constructor for setting all possible attributes - 
	 * name, resourceCounter, damageMin, and damageMax.
	 * 
	 * @param name name of the weapon.
	 * @param resourceCounter number of weapons.
	 * @param damageMin minimum amount of damage a weapon can make
	 * @param damageMax maximum amount of damage a weapon can make
	 */
	public Weapon(String name, int resourceCounter, double damageMin, double damageMax)
	{
		// assign the calling object with a name given in the parameters.
		this.setName(name);
		// assign the calling object with a number of weapons given in the parameters.
		this.setNumber(resourceCounter);
		/* 
		 * assign the calling object with an amount representing the 
		 * minimum amount of damage given in the parameters.
		 */
		this.damageMin = damageMin;
		/* 
		 * assign the calling object with an amount representing the 
		 * maximum amount of damage given in the parameters.
		 */
		this.damageMax = damageMax;
	}


	/**
	 * Gets the minimum amount of damage for a weapon.
	 * 
	 * @return the minimum amount of damage.
	 */
	public double getDamageMin()
	{
		return damageMin;
	}


	/**
	 * Gets the maximum amount of damage for a weapon.
	 * 
	 * @return the maximum amount of damage.
	 */
	public double getDamageMax()
	{
		return damageMax;
	}


	/**
	 * Tests the strength between two weapon objects
	 * 
	 * @return true if weapon given in argument is weaker than the calling object
	 */
	public boolean isStronger(Weapon weaponObject)
	{
		/* 
		 * test if the calling object's maximum damage is greater than the 
		 * maximum damage of the object given in the parameters. If the calling 
		 * object is stronger, return true. If not, return false 
		 */
		if(this.getDamageMax() > weaponObject.getDamageMax())
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
		return this.getName() + " Weapon" + ", number Remaining " + this.getNumber() + 
				" damageMin=" + this.getDamageMin() + ", damageMax=" + this.getDamageMax();
	}

}
