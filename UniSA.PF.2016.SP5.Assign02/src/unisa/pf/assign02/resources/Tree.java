package unisa.pf.assign02.resources;

/**
 * The Tree class provides a blueprint for creating Tree resources.
 * 
 * @author Fabian Tauriello
 */
abstract public class Tree extends Resource
{	
	/**
	 * Converts an object and its variables into a string.
	 * 
	 * @return an object as a string.
	 */
	@Override
	public String toString() 
	{
		return this.getName() + " Tree" + " number Remaining=" + this.getNumber();
	}
}
