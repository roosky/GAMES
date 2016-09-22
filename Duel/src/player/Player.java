package player;

import item.Item;

/**
 * This class represents a generic player 
 * 
 * */
public abstract class Player {
	/**
	 * Player Name
	 * */
	public String name;
	
	/**
	 * Player experience
	 * */
	public int xp;
	
	/**
	 * Primary weapon
	 * */	
	public Item weaponPrimary;

	/**
	 * Off-hand/Secondary weapon
	 * */	
	public Item weaponSecondary;

	/**
	 * Armor for the head (helmet)
	 * */	
	public Item armorHead;

	/**
	 * Armor for the torso/chest
	 * */	
	public Item armorTorso;

	/**
	 * Armor for the legs
	 * */	
	public Item armorLegs;

	/**
	 * Armor for the arms (bracers)
	 * */	
	public Item armorArms;

	/**
	 * Armor for the feet
	 * */	
	public Item armorFeet;
}
