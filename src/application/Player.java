import java.util.*;

public class Player {
	private Integer number;
	private Integer color;
	private List<Territory> territory_list;
	
	public Player (Integer m_number, List<Territory> m_territory_list) {
		number = m_number;
		territory_list = m_territory_list;
	}
	
	public void addTerritory (Territory e) {
		territory_list.add(e);
	}
	
	public void removeTerritory (Territory e) {
		territory_list.remove(e);
	}

	public List<Territory> getTerritory_list() {
		return territory_list;
	}

	public void setTerritory_list(List<Territory> territory_list) {
		this.territory_list = territory_list;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}
}
