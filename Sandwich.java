public class Sandwich{
	private String name;
	private int length;

	public Sandwich(String sandwichName, int sandwichLength){
		name = sandwichName;
		length = sandwichLength;
	}

	public int getLength(){
		return length;
	}

	public String getName(){
		return name;
	}

	public void setLength(int newLength){
		length = newLength;
	}
}