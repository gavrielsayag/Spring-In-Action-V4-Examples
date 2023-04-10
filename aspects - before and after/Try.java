package sound.system.cd.player;

public class Try {
	public static int ctr = 0;
	public Try()
	{
		++ctr;
	}
	
	
	public void Display()
	{
		System.out.println("hello! you wanted me to display with no args");
	}
	
	public void Display(int x)
	{
		System.out.println("hello! you wanted me to display with the number " + x);
	}
	
	public void Display(String x)
	{
		System.out.println("hello! you wanted me to display with the string \"" + x + "\"");
	}
	
	public void Display(int x, String y)
	{
		System.out.println("hello! you wanted me to display with the number " + x + ", and also you gave me a string \"" + y + "\", I feel special");
	}

}
