import java.util.Random;

public class Dice {
	Random generator = new Random();
	Integer face;
	
	public Integer roll()
	{
		return generator.nextInt(face);		
	}
	
	public Dice (int m_face)
	{
		face = m_face;
	}
}
