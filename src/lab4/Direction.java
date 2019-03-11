package lab4;

public enum Direction {

	NORTH("north", 4),
	NORTHEAST("northeast", 0),
	EAST("east", 5),
	SOUTHEAST("southeast", 2),
	SOUTH("south", 6),
	SOUTHWEST("southwest", 3),
	WEST("west", 7),
	NORTHWEST("northwest", 1);
	
	private String name = null;
	private int number;
	
	private Direction(String s, int n){
		name = s;
		number = n;
	}
	public String getName() {
		return name;
	}
	public int getNumber()
	{
		return number;
	}


}
