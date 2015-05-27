
public interface GameState {
	public void select(int territory, Player owner);
	public void fortify(int territory, Player owner, int army);
}
