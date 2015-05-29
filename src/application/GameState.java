
public interface GameState {
	public void select(int territory, Player owner);
	public void deploy(int territory, Player owner, int army);
	public void attack(int first_territory, int second_territory, int army , int defender_army);
	public void transfer(int first_territory, int second_territory, Player owner, int army);
}
