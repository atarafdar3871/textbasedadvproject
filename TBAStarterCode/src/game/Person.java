package game;

public abstract class Person {
	
	public Person(int healthPoints, String characterName, Item inventory[], boolean living) {
		this.healthPoints = healthPoints;
		this.characterName = characterName;
		this.inventory = inventory;
		this.living = true;
	}
	
	
	
}
