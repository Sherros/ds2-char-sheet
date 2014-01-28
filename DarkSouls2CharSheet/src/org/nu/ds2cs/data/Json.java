package org.nu.ds2cs.data;

/**
 *
 * @author peter
 */
public interface Json
{
	/**
	 * Serialize to JSON.
	 * @return Returns the {@link String} representation of this object in JSON format.
	 */
	public String toJson();
	
	/**
	 * Deserialize JSON into this object.
	 * @param json The {@link String} representation of this object in JSON format.
	 */
	public void parseJson(String json);
}