
public class EndGameState implements GameState{
	
	MapController controller;
	public EndGameState(MapController new_controller) {
		controller = new_controller;
	}

	@Override
	public void select(int territory, Player owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deploy(int territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int first_territory, int second_territory, Player owner,
			int army, int defender_army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int first_territory, int second_territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}

}
