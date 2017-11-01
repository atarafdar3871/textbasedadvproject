package game;
import items.Item;
public abstract class Person {
	
	private int healthPoints; //used for enemies and player during fighting to know when someone is dead or not, can possibly change item drops from enemies based on health
	private String characterName; //most likely going to be general names like Bat or Goblin or whatever
	private Item inventory[]; //inventory should be linked to each person and when dead you drop your inventory and the player can choose to pick it up
	private boolean living; //if healthPoints <= 0, person is dead, if this happens to you, GAME OVER 
	
	public Person(int healthPoints, String characterName, Item inventory[], boolean living) {
		this.healthPoints = healthPoints;
		this.characterName = characterName;
		this.inventory = inventory;
		this.living = true;
	}
	
	//the player can check inventory by typing in things like "check inventory" or whatever. it should return as a string into the console
	public String getInventory(Item inventory[]) {
		String textInv = "You currently are carrying ";
		for (int i=1)
		
		
		return textInv
	}
	
}
