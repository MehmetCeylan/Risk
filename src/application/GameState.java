
public interface GameState {
	public void select(int territory, Player owner);
	public void fortify(int territory, Player owner, int army);
	public void attack(Territory first_territory,Territory second_territory,int army);
}
