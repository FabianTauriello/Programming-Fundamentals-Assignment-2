package unisa.pf.assign02.resources;

/**
 * ResourceNotEnchanted class is an exception class and is thrown when
 * metal required isn't enchanted.
 * 
 * @author Fabian Tauriello
 */
public class ResourceNotEnchanted extends Exception
{
	public ResourceNotEnchanted()
	{
		// print out error message.
		System.out.println("You attempted to use a metal "
				+ "that wasn't enchanted where it was necessary");
	}
}
