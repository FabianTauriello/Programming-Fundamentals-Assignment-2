package unisa.pf.assign02.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * The Resource class provides a blueprint for creating and comparing a resource.
 * This class implements the Serializable interface.
 * 
 * @author Fabian Tauriello
 */
abstract public class Resource implements Serializable
{

	/**
	 * This variable represents the number of resources on hand.
	 */
	private int resourceCounter;


	/**
	 * This variable represents the name of the resource.
	 */
	private String name;


	/**
	 * No-argument Resource constructor.
	 */
	public Resource()
	{

	}


	/**
	 * Resource constructor specifying the name of the resource.
	 * 
	 * @param name name of the resource.
	 */
	public Resource(String name)
	{
		// assign the calling object with a name given in the parameters.
		this.name = name;
	}


	/**
	 * Resource constructor specifying the number of resources.
	 * 
	 * @param resourceCounter number of resources.
	 */
	public Resource(int resourceCounter)
	{
		/*
		 * assign the calling object with a number of resources given in
		 * the parameters.
		 */
		this.resourceCounter = resourceCounter;
	}


	/**
	 * Resource constructor specifying the name of the resource 
	 * and the number of resources.
	 * 
	 * @param name name of the resource.
	 * @param resourceCounter number of resources.
	 */
	public Resource(String name, int resourceCounter)
	{
		// assign the calling object with a name given in the parameters.
		this.name = name;
		/* 
		 * assign the calling object with a number of 
		 * resources given in the parameters.
		 */
		this.resourceCounter = resourceCounter;
	}


	/**
	 * This method increases the number of resources by a given number.
	 * 
	 * @param number number to increase resourceCounter by.
	 */
	public void increaseResources(int number)
	{
		/* 
		 * get the number of resources for the calling object and increase 
		 * it by the number given in the parameters.
		 */
		this.resourceCounter += number;
	}


	/**
	 * This method decreases the number of resources by a given number.
	 * 
	 * @param number number to decrease resourceCounter by
	 */
	public void decreaseResources(int number)
	{
		/* 
		 * get the calling object's number of resources and increase it 
		 * by the amount given in the parameters.
		 */
		this.resourceCounter -= number;
	}


	/**
	 * This method examines whether or not an object contains any resources.
	 * 
	 * @return true if a given object doesn't contain any resources.
	 */
	public boolean resourceAvailable()
	{
		// test if the number of resources is zero.
		if (this.resourceCounter <= 0)
		{
			// if the number of resources is zero or less, return false. 
			return false;
		}
		// if the number of resources is zero, return true. 
		return true;
	}


	/**
	 * Gets the number of resources.
	 * 
	 * @return the amount of resources for a given resource.
	 */
	public int getNumber() 
	{
		return this.resourceCounter;
	}


	/**
	 * Gets the name of the resource.
	 * 
	 * @return the name of the resource.
	 */
	public String getName() 
	{
		return this.name;
	}


	/**
	 * Sets the number of resources.
	 * 
	 * @param resourceCounter number of resources to set.
	 */
	public void setNumber(int resourceCounter) 
	{
		this.resourceCounter = resourceCounter;
	}


	/**
	 * Sets the name of the resource.
	 * 
	 * @param name name of the resource.
	 */
	public void setName(String name) 
	{
		this.name = name;
	}


	/**
	 * Writes a resource to the disk.
	 * 
	 * @param string name of the file to write into.
	 */
	public boolean saveToDisk(String fileName) 
	{
		try 
		{
			// output stream and a file are created for writing. 
			ObjectOutputStream outputStream = 
					new ObjectOutputStream(new FileOutputStream(fileName));
			// write the calling object to a file.
			outputStream.writeObject(this);
			// close the output stream.
			outputStream.close();
			// return true to confirm the object has been written to a file.
			return true;
		} 
		// catch any/all exceptions with file input/output.
		catch (IOException e) 
		{
			System.out.println("Problems with file output");
		}
		// return false if the object wasn't written to a file.
		return false;
	}


	/**
	 * Reads a resource from the disk and returns it to the caller.
	 * 
	 * @param string name of the file to read from.
	 * @return the resource that was read in a file.
	 */
	public static Resource readFromDisk(String fileName) 
	{
		try 
		{
			// input stream and a file are opened for reading. 
			ObjectInputStream inputStream = 
					new ObjectInputStream(new FileInputStream(fileName));
			// open the object in the file, cast it to a Resource type, and assign it to variable x.
			Resource x = (Resource)inputStream.readObject();
			// close the input stream.
			inputStream.close();
			// return true to confirm the object has been successfully read.
			return x;
		} 
		// catch an exception when the casting to a class is not possible because it doesn't exist.
		catch (ClassNotFoundException e) 
		{
			System.out.println("Problems with file input.");
		}
		// catch exception when file is not found on the disk.
		catch (FileNotFoundException e) 
		{
			System.out.println("Cannot find file " + fileName);
		}
		// catch any/all other exceptions with file input/output.
		catch (IOException e) 
		{
			System.out.println("Problems with input from " + fileName);
		} 
		// return null if the object wasn't opened successfully.
		return null;
	}


	/**
	 * Converts an object and its variables into a string.
	 * 
	 * @return an object as a string.
	 */
	@Override
	public String toString() 
	{
		return this.name + " number Remaining=" + this.resourceCounter;
	}


	/**
	 * Abstract method for getting the resource description.
	 * 
	 * @return the description of the resource.
	 */
	public abstract String getDescription();
}
