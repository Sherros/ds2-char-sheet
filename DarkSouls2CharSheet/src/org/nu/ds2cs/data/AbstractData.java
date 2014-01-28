package org.nu.ds2cs.data;

/**
 *
 * @author peter
 */
public abstract class AbstractData
{
	protected Integer id;
	
	public AbstractData(Integer id)
	{
		this.id = id;
	}
	
	public Integer getId() { return id; }
	
	public void setId(Integer id) { this.id = id; }
}