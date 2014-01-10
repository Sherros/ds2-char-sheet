package org.nu.ds2cs.data;

import android.content.Context;
import android.content.res.Resources;

/**
 * 
 * @author peter
 */
public class CharSheet
{
	private String name;
	private StartingClass startingClass;
	private Attributes startingAttributes;
	private Attributes attributes;
	
	public CharSheet(Context context, String name, StartingClass startingClass)
	{
		this.name = name;
		this.startingClass = startingClass;
		
		Resources res = context.getResources();
		int[] startingAttr = res.getIntArray(res.getIdentifier(startingClass.key, "array", context.getPackageName()));
		startingAttributes = new Attributes(startingAttr);
		attributes = new Attributes(startingAttr);
	}
	
	public int getStartingLevel() { return startingAttributes.getCurrentTotal(); }
	public int getSoulLevel() { return attributes.getCurrentTotal(); }
	public int getMaxLevel() { return Attributes.AttributeTotalMax - getStartingLevel(); }
	
	public Attributes getAttributes() { return attributes; }
	public String getName() { return name; }
	public Attributes getStartingAttributes() { return startingAttributes; }
	public StartingClass getStartingClass() { return startingClass; }
	
	public void setAttributes(Attributes attributes) { this.attributes = attributes; }
	public void setName(String name) { this.name = name; }
	public void setStartingAttributes(Attributes startingAttributes) { this.startingAttributes = startingAttributes; }
	public void setStartingClass(StartingClass startingClass) { this.startingClass = startingClass; }
}