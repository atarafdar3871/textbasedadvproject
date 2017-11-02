package items;

public abstract class Weapon extends Item{
	public int atkPoints;
	
	public Weapon(String itemName, boolean consumable, int atkPoints) {
		super(itemName, consumable);
		this.atkPoints = atkPoints;
	}
	
	
}
