public class Sandwich{
	private String name;
	private int length;

	public Sandwich(Sring sandwichName, int sandwichLength){
		name = sandwichName;
		length = sandwichLength
	}

	public int getLength(){
		return length;
	}

	public String getName(){
		return name;
	}

	public static void setLength(int newLength){
		length = newLength;
	}
}