import java.util.*;

public class Territory {
	private int number;
	private Player owner;
	private Integer army;
	
	public Territory(int m_number)
	{
		owner = null;
		army = 0;
		number = m_number;
	}

	public Integer getArmy() {
		return army;
	}

	public void setArmy(Integer army) {
		this.army = army;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
