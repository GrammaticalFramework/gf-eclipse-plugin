/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.treebank;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;

/**
 * Abstract class representing a file of line-separated values which are parsed into a list
 *
 * @param <T> the generic type
 */
public abstract class AbstractCollectionFile<T> {

	/**
	 * The file.
	 */
	protected IFile file;

	/**
	 * Parses the file.
	 */
	protected abstract void parseFile();

	/**
	 * The list.
	 */
	protected List<T> list;

	/**
	 * Instantiates the class and calls the parseFile() method
	 *
	 * @param file the file
	 */
	public AbstractCollectionFile(IFile file) {
		super();
		this.file = file;
		this.list = new ArrayList<T>();
		parseFile();
	}

	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public IFile getFile() {
		return file;
	}

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<T> getList() {
		return list;
	}
	
	/**
	 * Gets the nth item in the list.
	 *
	 * @param index
	 * @return the item at that position
	 */
	public T get(int index) {
		return list.get(index);
	}

	/**
	 * Get iterator over the items.
	 *
	 * @return the iterable
	 */
	public Iterable<T> getIterable() {
		return list;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return list.toString();
	}

	/**
	 * Gets the size of the list.
	 *
	 * @return the size
	 */
	public int getSize() {
		return list.size();
	}

}