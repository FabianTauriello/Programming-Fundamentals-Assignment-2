package unisa.pf.assign02.resources;

/**
 * The EnchantedPoleArm class is used to create EnchantedPoleArm objects 
 * using the Weapon and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class EnchantedPoleArm extends Weapon
{
	/**
	 * No-argument EnchantedPoleArm constructor.
	 */	
	public EnchantedPoleArm()
	{
		// call the super constructor and give the object default values.
		super("EnchantedPoleArm", 0, 20.0, 50.0);
	}

	
	/**
	 * EnchantedPoleArm constructor specifying the name of the EnchantedPoleArm object.
	 * 
	 * @param name name of the EnchantedPoleArm object.
	 */
	public EnchantedPoleArm(String name)
	{
		/* call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the rest of the variables with default values. */
		super(name, 0, 20.0, 50.0);
	}
	
	
	/**
	 * EnchantedPoleArm constructor specifying the amount of EnchantedPoleArms in an object.
	 * 
	 * @param resourceCounter amount of EnchantedPoleArms in an object.
	 */
	public EnchantedPoleArm(int resourceCounter)
	{
		/* call the super constructor and give the object a number of resources 
		 * (provided in the parameters) and assign the rest of the variables with default values. */
		super("EnchantedPoleArm", resourceCounter, 20.0, 50.0);
	}


	/**
	 * Gives a description of EnchantedPoleArm.
	 * 
	 * @return the description of EnchantedPoleArm.
	 */
	@Override
	public String getDescription()
	{
		return "Magical Enchanted Pole Arm";
	}
}
