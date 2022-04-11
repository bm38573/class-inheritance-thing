public class PBJ extends Sandwhich{
	private boolean hasPeanutButter;
	private boolean hasJelly;

	public PBJ(boolean peanutButter, boolean jelly){
		super(sandwichName, sandwichLength)
		hasPeanutButter = peanutButter;
		hasJelly = jelly;
	}

	public boolean peanutButter(){
		return hasPeanutButter;
	}

	public boolean jelly(){
		return hasJelly;
	}

	public static void setHasPeanutButter(boolean bool){
		hasPeanutButter = bool;
	}

	public static void setHasJelly(boolean bool){
		hasJelly = bool;
	}
}