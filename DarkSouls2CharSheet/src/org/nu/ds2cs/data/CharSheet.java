package org.nu.ds2cs.data;

import com.google.gson.Gson;

/**
 * 
 * @author peter
 */
public final class CharSheet extends AbstractData implements Json
{
	public static CharSheet instantiateFromJson(String json)
	{
		return new Gson().fromJson(json, CharSheet.class);
	}
	
	private String name;
	private StartingClass startingClass;
	private Integer startingLevel;
	private Attributes startingAttributes;
	private Attributes attributes;
	private Integer humanity;
	
	public CharSheet(Integer id, String name, StartingClass startingClass, int startingLevel, int[] startingAttributes)
	{
		super(id);
		this.name = name;
		this.startingClass = startingClass;
		this.startingLevel = startingLevel;
		this.startingAttributes = new Attributes(null, startingAttributes);
		this.attributes = new Attributes(null, startingAttributes);
		this.humanity = 0;
	}
	
	public CharSheet(String name, StartingClass startingClass, int startingLevel, int[] startingAttributes)
	{
		this(null, name, startingClass, startingLevel, startingAttributes);
	}
	
	public int getSoulLevel() { return startingLevel + (attributes.getCurrentTotal() - startingAttributes.getCurrentTotal()); }
	public int getMaxLevel() { return Attributes.AttributeTotalMax - getStartingLevel(); }
	
	public String getName() { return name; }
	public Integer getHumanity() { return humanity; }
	public Attributes getAttributes() { return attributes; }
	public Attributes getStartingAttributes() { return startingAttributes; }
	public Integer getStartingLevel() { return startingLevel; }
	public StartingClass getStartingClass() { return startingClass; }
	
	public void setName(String name) { this.name = name; }
	public void setHumanity(Integer humanity) { this.humanity = humanity; }
	public void setAttributes(Attributes attributes) { this.attributes = attributes; }
	public void setStartingClass(StartingClass startingClass) { this.startingClass = startingClass; }
	
	protected void setStartingAttributes(Attributes startingAttributes) { this.startingAttributes = startingAttributes; }
	protected void setStartingLevel(Integer startingLevel) { this.startingLevel = startingLevel; }

	public String toJson()
	{
		return new Gson().toJson(this);
	}

	public void parseJson(String json)
	{
		CharSheet parsed = new Gson().fromJson(json, CharSheet.class);
		if(parsed != null)
		{
			setId(parsed.getId());
			setName(parsed.getName());
			setHumanity(parsed.getHumanity());
			setAttributes(parsed.getAttributes());
			setStartingClass(parsed.getStartingClass());
			setStartingAttributes(parsed.getStartingAttributes());
			setStartingLevel(parsed.getStartingLevel());
		}
	}
}