package org.nu.ds2cs.data;

/**
 *
 * @author peter
 */
public enum StartingClass
{
	DualSwordsman("class_dualswordsman"),
	Hunter("class_hunter"),
	Soldier("class_soldier"),
	Sorcerer("class_sorcerer"),
	TempleKnight("class_templeknight"),
	Warrior("class_warrior");
	
	public String key;
	
	StartingClass(String key)
	{
		this.key = key;
	}
}