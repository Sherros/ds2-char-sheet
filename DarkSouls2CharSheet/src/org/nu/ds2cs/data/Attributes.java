package org.nu.ds2cs.data;

/**
 * 
 * @author peter
 */
public final class Attributes
{
	public static final int AttributeMin = 0;
	public static final int AttributeMax = 99;
	public static final int AttributeCount = 10;
	public static final int AttributeTotalMax = AttributeMax * AttributeCount;
	
	private int agility;
	private int attunement;
	private int dexterity;
	private int endurance;
	private int faith;
	private int intelligence;
	private int resistance;
	private int strength;
	private int vigor;
	private int vitality;
	
	/**
	 * Initialize all attributes to an individually specified value.
	 * @param vigor
	 * @param endurance
	 * @param vitality
	 * @param attunement
	 * @param strength
	 * @param dexterity
	 * @param resistance
	 * @param agility
	 * @param intelligence
	 * @param faith 
	 */
	public Attributes(int vigor, int endurance, int vitality, int attunement, int strength, int dexterity, int resistance, int agility, int intelligence, int faith)
	{
		this.agility = agility;
		this.attunement = attunement;
		this.dexterity = dexterity;
		this.endurance = endurance;
		this.faith = faith;
		this.intelligence = intelligence;
		this.resistance = resistance;
		this.strength = strength;
		this.vigor = vigor;
		this.vitality = vitality;
	}
	
	/**
	 * Initializes all attributes to 0.
	 */
	public Attributes()
	{
		this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	/**
	 * Initialize all attributes based on their corresponding index in the array <code>values</code>.
	 * Uses the order of the game's character sheet screen for matching index values with attributes.
	 * @param values 
	 */
	public Attributes(int[] values)
	{
		this(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9]);
	}
	
	public int getCurrentTotal()
	{
		return agility + attunement + dexterity + endurance + faith + intelligence + resistance + strength + vigor + vitality;
	}
	
	public int getAgility() { return agility; }
	public int getAttunement() { return attunement; }
	public int getDexterity() { return dexterity; }
	public int getEndurance() { return endurance; }
	public int getFaith() { return faith; }
	public int getIntelligence() { return intelligence; }
	public int getResistance() { return resistance; }
	public int getStrength() { return strength; }
	public int getVigor() { return vigor; }
	public int getVitality() { return vitality; }
	
	public void setAgility(int agility) { this.agility = normalizeValue(agility); }
	public void setAttunement(int attunement) { this.attunement = normalizeValue(attunement); }
	public void setDexterity(int dexterity) { this.dexterity = normalizeValue(dexterity); }
	public void setEndurance(int endurance) { this.endurance = normalizeValue(endurance); }
	public void setFaith(int faith) { this.faith = normalizeValue(faith); }
	public void setIntelligence(int intelligence) { this.intelligence = normalizeValue(intelligence); }
	public void setResistance(int resistance) { this.resistance = normalizeValue(resistance); }
	public void setStrength(int strength) { this.strength = normalizeValue(strength); }
	public void setVigor(int vigor) { this.vigor = normalizeValue(vigor); }
	public void setVitality(int vitality) { this.vitality = normalizeValue(vitality); }
	
	private int normalizeValue(int val)
	{
		if(val < AttributeMin)
			val = AttributeMin;
		if(val > AttributeMax)
			val = AttributeMax;
		return val;
	}
}