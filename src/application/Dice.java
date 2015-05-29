import java.util.Random;

public class Dice {
	Random generator = new Random();
	int face;
	
	public int roll()
	{
		return generator.nextInt(face);		
	}
	
	public Dice (int m_face)
	{
		face = m_face;
	}
}
