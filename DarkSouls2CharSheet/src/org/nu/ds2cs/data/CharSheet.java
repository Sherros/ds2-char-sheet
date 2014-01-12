package org.nu.ds2cs.data;

/**
 * 
 * @author peter
 */
public class CharSheet
{
	private String name;
	private StartingClass startingClass;
	private Integer startingLevel;
	private Attributes startingAttributes;
	private Attributes attributes;
	
	public CharSheet(String name, StartingClass startingClass, int startingLevel, int[] startingAttributes)
	{
		this.name = name;
		this.startingClass = startingClass;
		this.startingLevel = startingLevel;
		this.startingAttributes = new Attributes(startingAttributes);
		this.attributes = new Attributes(startingAttributes);
	}
	
	public int getSoulLevel() { return startingLevel + (attributes.getCurrentTotal() - startingAttributes.getCurrentTotal()); }
	public int getMaxLevel() { return Attributes.AttributeTotalMax - getStartingLevel(); }
	
	public Attributes getAttributes() { return attributes; }
	public String getName() { return name; }
	public Attributes getStartingAttributes() { return startingAttributes; }
	public Integer getStartingLevel() { return startingLevel; }
	public StartingClass getStartingClass() { return startingClass; }
	
	public void setAttributes(Attributes attributes) { this.attributes = attributes; }
	public void setName(String name) { this.name = name; }
	public void setStartingClass(StartingClass startingClass) { this.startingClass = startingClass; }
	
	protected void setStartingAttributes(Attributes startingAttributes) { this.startingAttributes = startingAttributes; }
	protected void setStartingLevel(Integer startingLevel) { this.startingLevel = startingLevel; }
}