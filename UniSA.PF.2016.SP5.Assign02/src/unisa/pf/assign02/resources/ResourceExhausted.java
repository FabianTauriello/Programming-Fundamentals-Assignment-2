package unisa.pf.assign02.resources;

/**
 * ResourceExhausted class is an exception class and is thrown when
 * required resources aren't available.
 * 
 * @author Fabian Tauriello
 */
public class ResourceExhausted extends Exception  
{
	public ResourceExhausted()
	{
		// print out error message.
		System.out.println("You attempted to consume a "
				+ "resource that had none available");
	}
}
