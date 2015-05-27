import java.util.*;

public class Player {
	private Integer number;
	private Integer color;
	private List<Territory> territory_list;
	private GameState state;
	private Integer deployedArmy;
	
	public Player () {
		number = 0;
		color = 0;
		deployedArmy = 0;
		state = null;
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

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
	}

	public Integer getDeployedArmy() {
		return deployedArmy;
	}

	public void setDeployedArmy(Integer deployedArmy) {
		this.deployedArmy = deployedArmy;
	}
}
