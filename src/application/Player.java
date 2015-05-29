public class Player {
	private Integer number;
	private Integer color;
	private Integer owned_territory;
	private GameState state;
	private double deployedArmy;
	
	public Player () {
		number = 0;
		color = 0;
		deployedArmy = 0;
		owned_territory = 0;
		state = null;
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

	public double getDeployedArmy() {
		return deployedArmy;
	}

	public void setDeployedArmy(double deployedArmy) {
		this.deployedArmy = deployedArmy;
	}

	public Integer getOwned_territory() {
		return owned_territory;
	}

	public void setOwned_territory(Integer owned_territory) {
		this.owned_territory = owned_territory;
	}
}
