package unisa.pf.assign02.resources;

/**
 * The Anduril class is used to create Anduril objects using the Weapon 
 * and Resource parent classes.
 * 
 * @author Fabian Tauriello
 */
public class Anduril extends Weapon
{

	/**
	 * No-argument Anduril constructor.
	 */	
	public Anduril()
	{
		// call the super constructor and give the object default values.
		super("Anduril", 0, 30.0, 80.0);
	}


	/**
	 * Anduril constructor specifying the name of the Anduril object.
	 * 
	 * @param name name of the Anduril object.
	 */
	public Anduril(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the rest of the variables with default values.
		 */
		super(name, 0, 8.0, 15.0);
	}


	/**
	 * Anduril constructor specifying the amount of andurils in an object.
	 * 
	 * @param resourceCounter amount of andurils in an object.
	 */
	public Anduril(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of resources 
		 * (provided in the parameters) and assign the rest of the variables with 
		 * default values. 
		 */
		super("Anduril", resourceCounter, 8.0, 15.0);
	}

	/**
	 * Increases the amount of resources in an Anduril object to a maximum of one.
	 * 
	 * @param number number to increase resourceCounter by.
	 */
	@Override
	public void increaseResources(int number) 
	{	
		// print out error message if the number entered into the parameters is below 1.
		if (number < 1)
		{
			System.out.println("You didn't correctly increase "
					+ "the number of resources. Try again");
		}
		/* 
		 * add 1 to the resource counter but only if the current resource count is less than 1.
		 * This will limit the number of Anduril resources to 1 only. 
		 */
		else if (this.getNumber() < 1)
		{	
			super.increaseResources(1);	
		}
	}

	/**
	 * Gives a description of Anduril.
	 * 
	 * @return the description of Anduril.
	 */
	@Override
	public String getDescription()
	{
		return "One Sword to Rule Them All";
	}
}
