package unisa.pf.assign02.resources;

/**
 * The Table class is used to craft resources.
 * 
 * @author Fabian Tauriello
 */
public class Table extends Resource 
{
	/**
	 * No-argument Table constructor.
	 */	
	public Table()
	{
		// call the super constructor and give the object default values.
		super("Table", 0); 
	}


	/**
	 * Table constructor specifying the name of the table object.
	 * 
	 * @param name name of the table object.
	 */	
	public Table(String name)
	{
		/* 
		 * call the super constructor and give the object a name (provided 
		 * in the parameters) and assign the other variable with a default value. 
		 */
		super(name, 0);
	}


	/**
	 * Table constructor specifying the amount of tables in an object.
	 * 
	 * @param resourceCounter amount of tables in an object.
	 */
	public Table(int resourceCounter)
	{
		/* 
		 * call the super constructor and give the object a number of Resources 
		 * (provided in the parameters) and assign the other variable with a default value. 
		 */
		super("Table", resourceCounter);
	}


	/**
	 * Crafts iron and wood into a sword.
	 * 
	 * @param swordIngredient Sword object representing the object to increase in number.
	 * @param ironIngredient Iron object used in the recipe.
	 * @param woodIngredient Wood object used in the recipe.
	 * @return swordIngredient newly crafted Sword resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Sword craft(Sword swordIngredient, Iron ironIngredient, Wood woodIngredient) 
			throws ResourceExhausted
	{	
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Sword resources and decrease all other ingredients, then return the Sword object.
		 */
		if (ironIngredient.getNumber() == 0 || woodIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			swordIngredient.increaseResources(1);
			ironIngredient.decreaseResources(1);
			woodIngredient.decreaseResources(1);
			return swordIngredient;
		}
	}


	/**
	 * Crafts wood into a javelin.
	 * 
	 * @param javelinIngredient Javelin object representing the object to increase in number.
	 * @param woodIngredient Wood object used in the recipe.
	 * @return javelinIngredient newly crafted Javelin resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Javelin craft(Javelin javelinIngredient, Wood woodIngredient) 
			throws ResourceExhausted
	{
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Javelin resources and decrease all other ingredients, then return the Javelin object.
		 */
		if (woodIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			javelinIngredient.increaseResources(1);
			woodIngredient.decreaseResources(1);
			return javelinIngredient;
		}
	}


	/**
	 * Crafts Anduril (a weapon) from an enchanted pole arm, sand, seed and steel.
	 * 
	 * @param andurilIngredient Anduril object representing the object to increase in number.
	 * @param enchantedPoleArmIngredient EnchantedPoleArm object used in the recipe.
	 * @param sandIngredient Sand object used in the recipe.
	 * @param seedIngredient Seed object used in the recipe.
	 * @param steelIngredient Steel object used in the recipe.
	 * @return andurilIngredient newly crafted Anduril resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Anduril craft(Anduril andurilIngredient, EnchantedPoleArm 
			enchantedPoleArmIngredient, Sand sandIngredient, Seed seedIngredient, 
			Steel steelIngredient) throws ResourceExhausted
	{	
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Anduril resources and decrease all other ingredients, then return the Anduril object.
		 */
		if (enchantedPoleArmIngredient.getNumber() == 0 
				|| sandIngredient.getNumber() == 0 
				|| seedIngredient.getNumber() == 0
				|| steelIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			andurilIngredient.increaseResources(1);
			enchantedPoleArmIngredient.decreaseResources(1);
			sandIngredient.decreaseResources(1);
			seedIngredient.decreaseResources(1);
			steelIngredient.decreaseResources(1);
			return andurilIngredient;
		}
	}


	/**
	 * Crafts iron, wood, steel and sand into a new crafting table.
	 * 
	 * @param tableIngredient Table object representing the object to increase in number.
	 * @param ironIngredient Iron object used in the recipe.
	 * @param sandIngredient Sand object used in the recipe.
	 * @param steelIngredient Steel object used in the recipe.
	 * @param woodIngredient Wood object used in the recipe.
	 * @return tableIngredient newly crafted Table resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Table craft(Table tableIngredient, Iron ironIngredient, Sand sandIngredient, 
			Steel steelIngredient, Wood woodIngredient) throws ResourceExhausted
	{
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Table resources and decrease all other ingredients, then return the Table object.
		 */
		if (ironIngredient.getNumber() == 0 || sandIngredient.getNumber() == 0 
				|| steelIngredient.getNumber() == 0
				|| woodIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			tableIngredient.increaseResources(1);
			ironIngredient.decreaseResources(1);
			sandIngredient.decreaseResources(1);
			steelIngredient.decreaseResources(1);
			woodIngredient.decreaseResources(1);
			return tableIngredient;
		}
	}


	/**
	 * Crafts steel into a dagger.
	 * 
	 * @param daggerIngredient Dagger object representing the object to increase in number.
	 * @param steelIngredient Steel object used in the recipe.
	 * @return daggerIngredient newly crafted Dagger resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Dagger craft(Dagger daggerIngredient, Steel steelIngredient) 
			throws ResourceExhausted
	{
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Dagger resources and decrease all other ingredients, then return the Dagger object.
		 */
		if (steelIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			daggerIngredient.increaseResources(1);
			steelIngredient.decreaseResources(1);
			return daggerIngredient;
		}
	}


	/**
	 * Crafts a tree into wood.
	 * 
	 * @param WoodIngredient Wood object representing the object to increase in number.
	 * @param treeIngredient Tree object used in the recipe.
	 * @return WoodIngredient newly crafted Wood resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Wood craft(Wood woodIngredient, Oak oakIngredient) throws ResourceExhausted
	{
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Wood resources and decrease all other ingredients, then return the Wood object.
		 */
		if (oakIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			woodIngredient.increaseResources(1);
			oakIngredient.decreaseResources(1);
			return woodIngredient;
		}
	}


	/**
	 * Crafts dirt, seed and water into a tree.
	 * 
	 * @param treeIngredient Tree object representing the object to increase in number.
	 * @param dirtIngredient Dirt object used in the recipe.
	 * @param seedIngredient Seed object used in the recipe.
	 * @param waterIngredient Water object used in the recipe.
	 * @return treeIngredient newly crafted Sword resource.
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 */
	public Tree craft(Tree treeIngregient, Dirt dirtIngredient, Seed seedIngredient, 
			Water waterIngredient) throws ResourceExhausted
	{
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * Tree resources and decrease all other ingredients, then return the Tree object.
		 */
		if (dirtIngredient.getNumber() == 0 || seedIngredient.getNumber() == 0 
				|| waterIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else
		{
			treeIngregient.increaseResources(1);
			dirtIngredient.decreaseResources(1);
			seedIngredient.decreaseResources(1);
			waterIngredient.decreaseResources(1);
			return treeIngregient;
		}
	}


	/**
	 * Crafts an enchanted polearm using any metal and a sword.
	 * 
	 * @param enchantedPoleArmIngredient EnchantedPoleArm object representing the object 
	 * to increase in number.
	 * @param metalIngredient Metal object used in the recipe.
	 * @param swordIngredient Sword object used in the recipe.
	 * @return enchantedPoleArmIngredient
	 * @throws ResourceExhausted exception thrown if required resources aren't available.
	 * @throws ResourceNotEnchanted exception thrown if metal required isn't enchanted
	 */
	public EnchantedPoleArm craft(EnchantedPoleArm enchantedPoleArmIngredient, Metal 
			metalIngredient, Sword swordIngredient) throws ResourceExhausted, ResourceNotEnchanted
	{
		/* 
		 * test if any ingredients (apart from the first one) have enough resources available.
		 * If there aren't, throw an exception. If there are, increase the number of 
		 * EnchantedPoleArm resources and decrease all other ingredients, 
		 * then return the EnchantedPoleArm object.
		 */
		if (metalIngredient.getNumber() == 0 || swordIngredient.getNumber() == 0)
		{
			throw new ResourceExhausted();
		}
		else if (metalIngredient.isEnchanted() == false)
		{
			// if the metal used in the recipe is not enchanted, throw an exception.
			throw new ResourceNotEnchanted();
		}
		else
		{
			enchantedPoleArmIngredient.increaseResources(1);
			metalIngredient.decreaseResources(1);
			swordIngredient.decreaseResources(1);
			return enchantedPoleArmIngredient;
		}
	}


	/**
	 * Uses a combination of any resources to determine the strongest weapon 
	 * (highest damage) that can be crafted.
	 * 
	 * @param args an unknown number of resources.
	 * @return the best weapon that can be crafted given the resources.
	 */
	public String findBestCraftableWeapon(final Resource... args) 
	{
		return null;
	}

	/**
	 * Tests if the findBestCraftableWeapon method was attempted.
	 * 
	 * @return true if I attempted the Final Part of this assignment.
	 */
	public boolean advancedAttempted() 
	{
		return false;
	}


	/**
	 * Gives a description of Table.
	 * 
	 * @return the description of Table.
	 */
	@Override
	public String getDescription() 
	{
		return "For All Of Your Crafting Needs";
	}
}
