public class PBJ extends Sandwich{
	private boolean hasPeanutButter;
	private boolean hasJelly;

	public PBJ(boolean peanutButter, boolean jelly){
		super(sandwichName, sandwichLength);
		hasPeanutButter = peanutButter;
		hasJelly = jelly;
	}

	public boolean peanutButter(){
		return hasPeanutButter;
	}

	public boolean jelly(){
		return hasJelly;
	}

	public void setHasPeanutButter(boolean bool){
		hasPeanutButter = bool;
	}

	public void setHasJelly(boolean bool){
		hasJelly = bool;
	}
}